package chess.piece.state;

import static chess.Fixtures.A3;
import static chess.Fixtures.A6;
import static org.assertj.core.api.Assertions.assertThat;

import chess.Movement;
import java.util.List;
import org.junit.jupiter.api.Test;

public class RookStateTest {
    @Test
    void 현재_위치에서_룩이_이동할_위치까지_가는_길을_가져올_수_있다() {
        // given
        PieceState pieceState = new RookState();

        // when
        List<Movement> movablePath = pieceState.findMovablePath(A3, A6);

        // then
        assertThat(movablePath).containsExactly(Movement.UP, Movement.UP, Movement.UP);
    }
}
