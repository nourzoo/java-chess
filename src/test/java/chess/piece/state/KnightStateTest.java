package chess.piece.state;

import static chess.Fixtures.B1;
import static chess.Fixtures.C3;
import static org.assertj.core.api.Assertions.assertThat;

import chess.Movement;
import java.util.List;
import org.junit.jupiter.api.Test;

public class KnightStateTest {
    @Test
    void 현재_위치에서_이동할_위치까지_가는_길을_가져올_수_있다() {
        // given
        PieceState pieceState = new KnightState();

        // when
        List<Movement> movablePath = pieceState.findMovablePath(B1, C3);

        // then
        assertThat(movablePath).containsExactly(Movement.UP, Movement.UP, Movement.RIGHT);
    }
}
