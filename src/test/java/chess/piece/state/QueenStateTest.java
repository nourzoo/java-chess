package chess.piece.state;

import static chess.Fixtures.A3;
import static chess.Fixtures.B1;
import static chess.Fixtures.D1;
import static chess.Fixtures.D3;
import static chess.Fixtures.D6;
import static chess.Fixtures.F5;
import static chess.Fixtures.G3;
import static org.assertj.core.api.Assertions.assertThat;

import chess.Movement;
import chess.Position;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class QueenStateTest {
    @ParameterizedTest
    @MethodSource("validParameters")
    void 현재_위치에서_퀸이_이동할_위치까지_가는_길을_가져올_수_있다(Position beforePosition, Position afterPosition, List<Movement> movements) {
        // given
        PieceState pieceState = new QueenState();

        // when
        List<Movement> movablePath = pieceState.findMovablePath(beforePosition, afterPosition);

        // then
        assertThat(movablePath).isEqualTo(movements);
    }

    private static Stream<Arguments> validParameters() {
        return Stream.of(
                Arguments.of(D3, D1, List.of(Movement.DOWN, Movement.DOWN)),
                Arguments.of(D3, D6, List.of(Movement.UP, Movement.UP, Movement.UP)),
                Arguments.of(D3, G3, List.of(Movement.RIGHT, Movement.RIGHT, Movement.RIGHT)),
                Arguments.of(D3, A3, List.of(Movement.LEFT, Movement.LEFT, Movement.LEFT)),
                Arguments.of(D3, F5, List.of(Movement.RIGHT_UP, Movement.RIGHT_UP)),
                Arguments.of(D3, B1, List.of(Movement.LEFT_DOWN, Movement.LEFT_DOWN))
        );
    }
}
