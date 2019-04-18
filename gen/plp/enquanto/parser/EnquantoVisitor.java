// Generated from /home/daniel/Projects/While/src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.7.2
package plp.enquanto.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnquantoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnquantoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(EnquantoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(EnquantoParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(EnquantoParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#seqInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqInstr(EnquantoParser.SeqInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(EnquantoParser.ArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#paramsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsList(EnquantoParser.ParamsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#execFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecFuncao(EnquantoParser.ExecFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#declFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFuncao(EnquantoParser.DeclFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnquantoParser#seqComando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqComando(EnquantoParser.SeqComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(EnquantoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(EnquantoParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code se}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe(EnquantoParser.SeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enquanto}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(EnquantoParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exiba}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExiba(EnquantoParser.ExibaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escreva}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva(EnquantoParser.EscrevaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code laco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaco(EnquantoParser.LacoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code escolha}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolha(EnquantoParser.EscolhaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloco}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(EnquantoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcao}
	 * labeled alternative in {@link EnquantoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(EnquantoParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leia}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia(EnquantoParser.LeiaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(EnquantoParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opBin}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBin(EnquantoParser.OpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFuncao}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFuncao(EnquantoParser.ExprFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(EnquantoParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPar}
	 * labeled alternative in {@link EnquantoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPar(EnquantoParser.ExpParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitELogico(EnquantoParser.ELogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(EnquantoParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorLogico(EnquantoParser.XorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naoLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaoLogico(EnquantoParser.NaoLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opRel}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRel(EnquantoParser.OpRelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPar}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPar(EnquantoParser.BoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ouLogico}
	 * labeled alternative in {@link EnquantoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuLogico(EnquantoParser.OuLogicoContext ctx);
}