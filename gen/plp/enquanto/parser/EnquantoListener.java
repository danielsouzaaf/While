// Generated from /home/daniel/Projects/While/src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.7.2
package plp.enquanto.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnquantoParser}.
 */
public interface EnquantoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(EnquantoParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(EnquantoParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(EnquantoParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(EnquantoParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#seqInstr}.
	 * @param ctx the parse tree
	 */
	void enterSeqInstr(EnquantoParser.SeqInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#seqInstr}.
	 * @param ctx the parse tree
	 */
	void exitSeqInstr(EnquantoParser.SeqInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(EnquantoParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(EnquantoParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#paramsList}.
	 * @param ctx the parse tree
	 */
	void enterParamsList(EnquantoParser.ParamsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#paramsList}.
	 * @param ctx the parse tree
	 */
	void exitParamsList(EnquantoParser.ParamsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#execFuncao}.
	 * @param ctx the parse tree
	 */
	void enterExecFuncao(EnquantoParser.ExecFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#execFuncao}.
	 * @param ctx the parse tree
	 */
	void exitExecFuncao(EnquantoParser.ExecFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#declFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclFuncao(EnquantoParser.DeclFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#declFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclFuncao(EnquantoParser.DeclFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void enterSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 */
	void exitSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterSe(EnquantoParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitSe(EnquantoParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code laco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterLaco(EnquantoParser.LacoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitLaco(EnquantoParser.LacoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escolha}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterEscolha(EnquantoParser.EscolhaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escolha}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitEscolha(EnquantoParser.EscolhaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(EnquantoParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(EnquantoParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFuncao}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExprFuncao(EnquantoParser.ExprFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFuncao}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExprFuncao(EnquantoParser.ExprFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterId(EnquantoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitId(EnquantoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(EnquantoParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(EnquantoParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterXorLogico(EnquantoParser.XorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitXorLogico(EnquantoParser.XorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolPar(EnquantoParser.BoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolPar(EnquantoParser.BoolParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ouLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterOuLogico(EnquantoParser.OuLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ouLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitOuLogico(EnquantoParser.OuLogicoContext ctx);
}