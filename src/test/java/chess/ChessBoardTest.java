package chess;

import static chess.Fixtures.A1;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import chess.piece.Piece;
import chess.piece.Rook;
import org.junit.jupiter.api.Test;

public class ChessBoardTest {
    @Test
    void 체스판을_초기화할_수_있다() {
        // when & then
        assertDoesNotThrow(() -> new ChessBoard());
    }

    @Test
    void 기물의_위치를_가져올_수_있다() {
        // given
        ChessBoard chessBoard = new ChessBoard();

        // when
        Piece piece = chessBoard.getPieceFrom(A1);

        // then
        assertThat(piece instanceof Rook).isTrue();
    }
}
