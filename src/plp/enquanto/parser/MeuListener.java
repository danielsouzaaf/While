package plp.enquanto.parser;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import org.antlr.v4.runtime.tree.TerminalNode;
import plp.enquanto.linguagem.Linguagem.*;

public class MeuListener extends EnquantoBaseListener {
	private final Leia leia = new Leia();
	private final Skip skip = new Skip();
	private final ParseTreeProperty<Object> values = new ParseTreeProperty<>();

	private Programa programa;
	private Map<String, Funcao> funcoes = new Hashtable<String, Funcao>();

	public Programa getPrograma() {
		return programa;
	}

	private void setValue(final ParseTree node, final Object value) {
		values.put(node, value);
	}

	private Object getValue(final ParseTree node) {
		return values.get(node);
	}

	@Override
	public void exitBooleano(final EnquantoParser.BooleanoContext ctx) {
		setValue(ctx, new Booleano(ctx.getText().equals("verdadeiro")));
	}

	@Override
	public void exitLeia(final EnquantoParser.LeiaContext ctx) {
		setValue(ctx, leia);
	}

	@Override
	public void exitSe(final EnquantoParser.SeContext ctx) {
		final Bool condicaoSe = (Bool) getValue(ctx.bool(0));
		final Comando entao = (Comando) getValue(ctx.comando(0));

		List<Bool> condicaoSenaoSe = new ArrayList<>();
		List<Comando> comandoSenaoSe = new ArrayList<>();
		Comando comandoSenao = null;
		// thanks to duarte, mesmo no canadá continua me ajudando.
		// https://github.com/duartefq/While/blob/d6ac595bfb38eb39d7a6a7f0a8cd2a24e2d92064/src/plp/enquanto/parser/MeuListener.java#L40
		if (ctx.bool().size() > 1) { // we have two conditions, ie, se and senaose
			for (int i = 1; i < ctx.bool().size(); i++) {
				condicaoSenaoSe.add((Bool) getValue(ctx.bool(i)));
				comandoSenaoSe.add((Comando) getValue(ctx.comando(i)));
			}
		}

		if (ctx.comando().size() > ctx.bool().size()) { // we have a senao clause
			comandoSenao = (Comando) getValue(ctx.comando(ctx.comando().size() - 1));
		}

		setValue(ctx, new Se(condicaoSe, entao, comandoSenao,
				condicaoSenaoSe, comandoSenaoSe));
	}

	@Override
	public void exitInteiro(final EnquantoParser.InteiroContext ctx) {
		setValue(ctx, new Inteiro(Integer.parseInt(ctx.getText())));
	}

	@Override
	public void exitSkip(final EnquantoParser.SkipContext ctx) {
		setValue(ctx, skip);
	}

	@Override
	public void exitEscreva(final EnquantoParser.EscrevaContext ctx) {
		final Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Escreva(exp));
	}

	@Override
	public void exitPrograma(final EnquantoParser.ProgramaContext ctx) {
		@SuppressWarnings("unchecked")
		final List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		programa = new Programa(cmds);
		setValue(ctx, programa);
	}

	@Override
	public void exitId(final EnquantoParser.IdContext ctx) {
		setValue(ctx, new Id(ctx.ID().getText()));
	}

	@Override
	public void exitSeqComando(final EnquantoParser.SeqComandoContext ctx) {
		final List<Comando> comandos = new ArrayList<>();
		for (EnquantoParser.ComandoContext c : ctx.comando()) {
			comandos.add((Comando) getValue(c));
		}
		setValue(ctx, comandos);
	}

	@Override
	public void exitAtribuicao(final EnquantoParser.AtribuicaoContext ctx) {
		final String id = ctx.ID().getText();
		final Expressao exp = (Expressao) getValue(ctx.expressao());
		setValue(ctx, new Atribuicao(id, exp));
	}

	@Override
	public void exitBloco(final EnquantoParser.BlocoContext ctx) {
		@SuppressWarnings("unchecked")
		final List<Comando> cmds = (List<Comando>) getValue(ctx.seqComando());
		setValue(ctx, new Bloco(cmds));
	}

	@Override
	public void exitOpBin(final EnquantoParser.OpBinContext ctx) {
		final Expressao esq = (Expressao) getValue(ctx.expressao(0));
		final Expressao dir = (Expressao) getValue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final ExpBin exp;
		switch (op) {
		case "+":
			exp = new ExpSoma(esq, dir);
			break;
		case "*":
			exp = new ExpMult(esq, dir);
			break;
		case "-":
			exp = new ExpSub(esq, dir);
			break;
		case "/":
			exp = new ExpDiv(esq, dir);
			break;
		case "^":
			exp = new ExpPot(esq, dir);
			break;
		default:
			exp = new ExpSoma(esq, dir);
		}
		setValue(ctx, exp);
	}

	@Override
	public void exitEnquanto(final EnquantoParser.EnquantoContext ctx) {
		final Bool condicao = (Bool) getValue(ctx.bool());
		final Comando comando = (Comando) getValue(ctx.comando());
		setValue(ctx, new Enquanto(condicao, comando));
	}

	@Override
	public void exitELogico(final EnquantoParser.ELogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new ELogico(esq, dir));
	}

	@Override
	public void exitBoolPar(final EnquantoParser.BoolParContext ctx) {
		setValue(ctx, getValue(ctx.bool()));
	}

	@Override
	public void exitNaoLogico(final EnquantoParser.NaoLogicoContext ctx) {
		final Bool b = (Bool) getValue(ctx.bool());
		setValue(ctx, new NaoLogico(b));
	}

	@Override
	public void exitExpPar(final EnquantoParser.ExpParContext ctx) {
		setValue(ctx, getValue(ctx.expressao()));
	}

	@Override
	public void exitExiba(final EnquantoParser.ExibaContext ctx) {
		final String t = ctx.Texto().getText();
		final String texto = t.substring(1, t.length() - 1);
		setValue(ctx, new Exiba(texto));
	}

	@Override
	public void exitOpRel(final EnquantoParser.OpRelContext ctx) {
		final Expressao esq = (Expressao) getValue(ctx.expressao(0));
		final Expressao dir = (Expressao) getValue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final ExpRel exp;
		switch (op) {
		case "=":
			exp = new ExpIgual(esq, dir);
			break;
		case "<=":
			exp = new ExpMenorIgual(esq, dir);
			break;
		case ">=":
			exp = new ExpMaiorIgual(esq, dir);
			break;
		case "<>":
			exp = new ExpDiferente(esq, dir);
			break;
		case "<":
			exp = new ExpMenor(esq, dir);
			break;
		case ">":
			exp = new ExpMaior(esq, dir);
			break;
		default:
			exp = new ExpIgual(esq, dir);
		}
		setValue(ctx, exp);
	}

	@Override
	public void exitLaco(EnquantoParser.LacoContext ctx) {
		final String id = (ctx.ID().getText());
		final Expressao de = (Expressao) getValue(ctx.expressao(0));
		final Expressao ate = (Expressao) getValue(ctx.expressao(1));
		final Expressao passo = (Expressao) getValue(ctx.INT());

		final List<Comando> comandos = (List<Comando>) getValue(ctx.comando());

		setValue(ctx, new Laco(id, de, ate, passo, comandos));
	}

	@Override
	public void exitOuLogico(EnquantoParser.OuLogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new OuLogico(esq, dir));
	}

	@Override
	public void exitXorLogico(EnquantoParser.XorLogicoContext ctx) {
		final Bool esq = (Bool) getValue(ctx.bool(0));
		final Bool dir = (Bool) getValue(ctx.bool(1));
		setValue(ctx, new XorLogico(esq, dir));
	}

	@Override
	public void exitEscolha(EnquantoParser.EscolhaContext ctx) {
		final String id = ctx.ID().getText();
		List<Expressao> casos = new ArrayList<Expressao>();
		List<List<Comando>> listaComandos = new ArrayList<List<Comando>>();

		for	(EnquantoParser.ExpressaoContext exctx : ctx.expressao()) {
			casos.add((Expressao) getValue(exctx));
		}

		for	(EnquantoParser.SeqComandoContext comctx : ctx.seqComando()) {
			listaComandos.add((List<Comando>) getValue(comctx));
		}
		setValue(ctx, new Escolha(id, casos, listaComandos));
	}

	@Override
	public void enterDeclFuncao(EnquantoParser.DeclFuncaoContext ctx) {

		final String id = ctx.ID().getText();
		final Funcao funcao = new Funcao(id);

		funcoes.put(id, funcao);
	}

	@Override
	public void exitDeclFuncao(EnquantoParser.DeclFuncaoContext ctx) {
		final String id = ctx.ID().getText();
		final Expressao retorno = (Expressao) getValue(ctx.expressao());
		final Funcao funcao = funcoes.get(id);

		final List<String> args = new ArrayList<String>();
		final EnquantoParser.ArgsListContext argsCtx = ctx.argsList();

		for (TerminalNode idNode : argsCtx.ID()) {
			args.add(idNode.getText());
		}

		funcao.setArgs(args);
		funcao.setRetorno(retorno);

		setValue(ctx, funcao);
	}
}
