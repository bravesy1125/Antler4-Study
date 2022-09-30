// Generated from c:\Users\windows\Desktop\COMPILER\antlrtest\MAT.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MATParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MATVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MATParser#defpinmap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefpinmap(MATParser.DefpinmapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#defpingroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefpingroups(MATParser.DefpingroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MATParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtset(MATParser.StmtsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtread(MATParser.StmtreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtif(MATParser.StmtifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtloop(MATParser.StmtloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtgoto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtgoto(MATParser.StmtgotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#stmtcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtcall(MATParser.StmtcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#deffunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffunc(MATParser.DeffuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(MATParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#pingroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPingroup(MATParser.PingroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#setexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetexp(MATParser.SetexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#readexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadexp(MATParser.ReadexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MATParser#channel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannel(MATParser.ChannelContext ctx);
}