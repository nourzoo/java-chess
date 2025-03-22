package chess;

import chess.piece.Bishop;
import chess.piece.King;
import chess.piece.Knight;
import chess.piece.Pawn;
import chess.piece.Piece;
import chess.piece.Queen;
import chess.piece.Rook;
import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private Map<Position, Piece> chessBoard;

    public ChessBoard() {
        this.chessBoard = initialChessBoard();
    }

    public Piece getPieceFrom(Position position) {
        return chessBoard.get(position);
    }

    private Map<Position, Piece> initialChessBoard() {
        Map<Position, Piece> chessBoard = new HashMap<>();

        chessBoard.put(new Position(Column.A, Row.ONE), new Rook());
        chessBoard.put(new Position(Column.B, Row.ONE), new Knight());
        chessBoard.put(new Position(Column.C, Row.ONE), new Bishop());
        chessBoard.put(new Position(Column.D, Row.ONE), new Queen());
        chessBoard.put(new Position(Column.E, Row.ONE), new King());
        chessBoard.put(new Position(Column.F, Row.ONE), new Bishop());
        chessBoard.put(new Position(Column.G, Row.ONE), new Knight());
        chessBoard.put(new Position(Column.H, Row.ONE), new Rook());
        chessBoard.put(new Position(Column.A, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.B, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.C, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.D, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.E, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.F, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.G, Row.TWO), new Pawn());
        chessBoard.put(new Position(Column.H, Row.TWO), new Pawn());

        chessBoard.put(new Position(Column.A, Row.EIGHT), new Rook());
        chessBoard.put(new Position(Column.B, Row.EIGHT), new Knight());
        chessBoard.put(new Position(Column.C, Row.EIGHT), new Bishop());
        chessBoard.put(new Position(Column.D, Row.EIGHT), new Queen());
        chessBoard.put(new Position(Column.E, Row.EIGHT), new King());
        chessBoard.put(new Position(Column.F, Row.EIGHT), new Bishop());
        chessBoard.put(new Position(Column.G, Row.EIGHT), new Knight());
        chessBoard.put(new Position(Column.H, Row.EIGHT), new Rook());
        chessBoard.put(new Position(Column.A, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.B, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.C, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.D, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.E, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.F, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.G, Row.SEVEN), new Pawn());
        chessBoard.put(new Position(Column.H, Row.SEVEN), new Pawn());

        return chessBoard;
    }
}
