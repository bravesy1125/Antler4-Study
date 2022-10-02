// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MATParser}.
 */
public interface MATListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MATParser#complete}.
	 * @param ctx the parse tree
	 */
	void enterComplete(MATParser.CompleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#complete}.
	 * @param ctx the parse tree
	 */
	void exitComplete(MATParser.CompleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#defs}.
	 * @param ctx the parse tree
	 */
	void enterDefs(MATParser.DefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#defs}.
	 * @param ctx the parse tree
	 */
	void exitDefs(MATParser.DefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#defpinmap}.
	 * @param ctx the parse tree
	 */
	void enterDefpinmap(MATParser.DefpinmapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#defpinmap}.
	 * @param ctx the parse tree
	 */
	void exitDefpinmap(MATParser.DefpinmapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#defpingroups}.
	 * @param ctx the parse tree
	 */
	void enterDefpingroups(MATParser.DefpingroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#defpingroups}.
	 * @param ctx the parse tree
	 */
	void exitDefpingroups(MATParser.DefpingroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void enterDeffunc(MATParser.DeffuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#deffunc}.
	 * @param ctx the parse tree
	 */
	void exitDeffunc(MATParser.DeffuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(MATParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(MATParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MATParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MATParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtset}.
	 * @param ctx the parse tree
	 */
	void enterStmtset(MATParser.StmtsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtset}.
	 * @param ctx the parse tree
	 */
	void exitStmtset(MATParser.StmtsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtread}.
	 * @param ctx the parse tree
	 */
	void enterStmtread(MATParser.StmtreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtread}.
	 * @param ctx the parse tree
	 */
	void exitStmtread(MATParser.StmtreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtif}.
	 * @param ctx the parse tree
	 */
	void enterStmtif(MATParser.StmtifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtif}.
	 * @param ctx the parse tree
	 */
	void exitStmtif(MATParser.StmtifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtloop}.
	 * @param ctx the parse tree
	 */
	void enterStmtloop(MATParser.StmtloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtloop}.
	 * @param ctx the parse tree
	 */
	void exitStmtloop(MATParser.StmtloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtgoto}.
	 * @param ctx the parse tree
	 */
	void enterStmtgoto(MATParser.StmtgotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtgoto}.
	 * @param ctx the parse tree
	 */
	void exitStmtgoto(MATParser.StmtgotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtcall}.
	 * @param ctx the parse tree
	 */
	void enterStmtcall(MATParser.StmtcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtcall}.
	 * @param ctx the parse tree
	 */
	void exitStmtcall(MATParser.StmtcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtinc}.
	 * @param ctx the parse tree
	 */
	void enterStmtinc(MATParser.StmtincContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtinc}.
	 * @param ctx the parse tree
	 */
	void exitStmtinc(MATParser.StmtincContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#stmtdec}.
	 * @param ctx the parse tree
	 */
	void enterStmtdec(MATParser.StmtdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#stmtdec}.
	 * @param ctx the parse tree
	 */
	void exitStmtdec(MATParser.StmtdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(MATParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(MATParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#pingroup}.
	 * @param ctx the parse tree
	 */
	void enterPingroup(MATParser.PingroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#pingroup}.
	 * @param ctx the parse tree
	 */
	void exitPingroup(MATParser.PingroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#setexp}.
	 * @param ctx the parse tree
	 */
	void enterSetexp(MATParser.SetexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#setexp}.
	 * @param ctx the parse tree
	 */
	void exitSetexp(MATParser.SetexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#readexp}.
	 * @param ctx the parse tree
	 */
	void enterReadexp(MATParser.ReadexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#readexp}.
	 * @param ctx the parse tree
	 */
	void exitReadexp(MATParser.ReadexpContext ctx);
}