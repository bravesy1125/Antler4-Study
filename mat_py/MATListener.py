# Generated from MAT.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MATParser import MATParser
else:
    from MATParser import MATParser

# This class defines a complete listener for a parse tree produced by MATParser.
class MATListener(ParseTreeListener):

    # Enter a parse tree produced by MATParser#start.
    def enterStart(self, ctx:MATParser.StartContext):
        pass

    # Exit a parse tree produced by MATParser#start.
    def exitStart(self, ctx:MATParser.StartContext):
        pass


    # Enter a parse tree produced by MATParser#defs.
    def enterDefs(self, ctx:MATParser.DefsContext):
        pass

    # Exit a parse tree produced by MATParser#defs.
    def exitDefs(self, ctx:MATParser.DefsContext):
        pass


    # Enter a parse tree produced by MATParser#defpinmaps.
    def enterDefpinmaps(self, ctx:MATParser.DefpinmapsContext):
        pass

    # Exit a parse tree produced by MATParser#defpinmaps.
    def exitDefpinmaps(self, ctx:MATParser.DefpinmapsContext):
        pass


    # Enter a parse tree produced by MATParser#defpingroups.
    def enterDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        pass

    # Exit a parse tree produced by MATParser#defpingroups.
    def exitDefpingroups(self, ctx:MATParser.DefpingroupsContext):
        pass


    # Enter a parse tree produced by MATParser#deftimeset.
    def enterDeftimeset(self, ctx:MATParser.DeftimesetContext):
        pass

    # Exit a parse tree produced by MATParser#deftimeset.
    def exitDeftimeset(self, ctx:MATParser.DeftimesetContext):
        pass


    # Enter a parse tree produced by MATParser#defvoltagelevels.
    def enterDefvoltagelevels(self, ctx:MATParser.DefvoltagelevelsContext):
        pass

    # Exit a parse tree produced by MATParser#defvoltagelevels.
    def exitDefvoltagelevels(self, ctx:MATParser.DefvoltagelevelsContext):
        pass


    # Enter a parse tree produced by MATParser#deffunc.
    def enterDeffunc(self, ctx:MATParser.DeffuncContext):
        pass

    # Exit a parse tree produced by MATParser#deffunc.
    def exitDeffunc(self, ctx:MATParser.DeffuncContext):
        pass


    # Enter a parse tree produced by MATParser#labeled_statement.
    def enterLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        pass

    # Exit a parse tree produced by MATParser#labeled_statement.
    def exitLabeled_statement(self, ctx:MATParser.Labeled_statementContext):
        pass


    # Enter a parse tree produced by MATParser#stmt.
    def enterStmt(self, ctx:MATParser.StmtContext):
        pass

    # Exit a parse tree produced by MATParser#stmt.
    def exitStmt(self, ctx:MATParser.StmtContext):
        pass


    # Enter a parse tree produced by MATParser#stmttimeset.
    def enterStmttimeset(self, ctx:MATParser.StmttimesetContext):
        pass

    # Exit a parse tree produced by MATParser#stmttimeset.
    def exitStmttimeset(self, ctx:MATParser.StmttimesetContext):
        pass


    # Enter a parse tree produced by MATParser#stmtset.
    def enterStmtset(self, ctx:MATParser.StmtsetContext):
        pass

    # Exit a parse tree produced by MATParser#stmtset.
    def exitStmtset(self, ctx:MATParser.StmtsetContext):
        pass


    # Enter a parse tree produced by MATParser#stmtread.
    def enterStmtread(self, ctx:MATParser.StmtreadContext):
        pass

    # Exit a parse tree produced by MATParser#stmtread.
    def exitStmtread(self, ctx:MATParser.StmtreadContext):
        pass


    # Enter a parse tree produced by MATParser#stmtinc.
    def enterStmtinc(self, ctx:MATParser.StmtincContext):
        pass

    # Exit a parse tree produced by MATParser#stmtinc.
    def exitStmtinc(self, ctx:MATParser.StmtincContext):
        pass


    # Enter a parse tree produced by MATParser#stmtdec.
    def enterStmtdec(self, ctx:MATParser.StmtdecContext):
        pass

    # Exit a parse tree produced by MATParser#stmtdec.
    def exitStmtdec(self, ctx:MATParser.StmtdecContext):
        pass


    # Enter a parse tree produced by MATParser#stmtgoto.
    def enterStmtgoto(self, ctx:MATParser.StmtgotoContext):
        pass

    # Exit a parse tree produced by MATParser#stmtgoto.
    def exitStmtgoto(self, ctx:MATParser.StmtgotoContext):
        pass


    # Enter a parse tree produced by MATParser#stmtcall.
    def enterStmtcall(self, ctx:MATParser.StmtcallContext):
        pass

    # Exit a parse tree produced by MATParser#stmtcall.
    def exitStmtcall(self, ctx:MATParser.StmtcallContext):
        pass


    # Enter a parse tree produced by MATParser#stmtrepeat.
    def enterStmtrepeat(self, ctx:MATParser.StmtrepeatContext):
        pass

    # Exit a parse tree produced by MATParser#stmtrepeat.
    def exitStmtrepeat(self, ctx:MATParser.StmtrepeatContext):
        pass


    # Enter a parse tree produced by MATParser#stmtloop.
    def enterStmtloop(self, ctx:MATParser.StmtloopContext):
        pass

    # Exit a parse tree produced by MATParser#stmtloop.
    def exitStmtloop(self, ctx:MATParser.StmtloopContext):
        pass


    # Enter a parse tree produced by MATParser#stmtif.
    def enterStmtif(self, ctx:MATParser.StmtifContext):
        pass

    # Exit a parse tree produced by MATParser#stmtif.
    def exitStmtif(self, ctx:MATParser.StmtifContext):
        pass


    # Enter a parse tree produced by MATParser#map.
    def enterMap(self, ctx:MATParser.MapContext):
        pass

    # Exit a parse tree produced by MATParser#map.
    def exitMap(self, ctx:MATParser.MapContext):
        pass


    # Enter a parse tree produced by MATParser#pingroup.
    def enterPingroup(self, ctx:MATParser.PingroupContext):
        pass

    # Exit a parse tree produced by MATParser#pingroup.
    def exitPingroup(self, ctx:MATParser.PingroupContext):
        pass


    # Enter a parse tree produced by MATParser#timeset.
    def enterTimeset(self, ctx:MATParser.TimesetContext):
        pass

    # Exit a parse tree produced by MATParser#timeset.
    def exitTimeset(self, ctx:MATParser.TimesetContext):
        pass


    # Enter a parse tree produced by MATParser#voltagelevel.
    def enterVoltagelevel(self, ctx:MATParser.VoltagelevelContext):
        pass

    # Exit a parse tree produced by MATParser#voltagelevel.
    def exitVoltagelevel(self, ctx:MATParser.VoltagelevelContext):
        pass


    # Enter a parse tree produced by MATParser#setexp.
    def enterSetexp(self, ctx:MATParser.SetexpContext):
        pass

    # Exit a parse tree produced by MATParser#setexp.
    def exitSetexp(self, ctx:MATParser.SetexpContext):
        pass


    # Enter a parse tree produced by MATParser#readexp.
    def enterReadexp(self, ctx:MATParser.ReadexpContext):
        pass

    # Exit a parse tree produced by MATParser#readexp.
    def exitReadexp(self, ctx:MATParser.ReadexpContext):
        pass



del MATParser