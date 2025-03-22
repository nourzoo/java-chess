package chess.piece.state;

import static chess.Fixtures.B2;
import static chess.Fixtures.C1;
import static chess.Fixtures.C5;
import static chess.Fixtures.D3;
import static chess.Fixtures.E5;
import static chess.Fixtures.F4;
import static org.assertj.core.api.Assertions.assertThat;

import chess.Movement;
import chess.Position;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class KnightStateTest {
    @ParameterizedTest
    @MethodSource("validParameters")
    void 현재_위치에서_나이트가_이동할_위치까지_가는_길을_가져올_수_있다(Position beforePosition, Position afterPosition,
                                              List<Movement> movements) {
        // given
        PieceState pieceState = new KnightState();

        // when
        List<Movement> movablePath = pieceState.findMovablePath(beforePosition, afterPosition);

        // then
        assertThat(movablePath).isEqualTo(movements);
    }

    private static Stream<Arguments> validParameters() {
        return Stream.of(
                Arguments.of(D3, F4, List.of(Movement.RIGHT, Movement.RIGHT, Movement.UP)),
                Arguments.of(D3, E5, List.of(Movement.UP, Movement.UP, Movement.RIGHT)),
                Arguments.of(D3, C5, List.of(Movement.UP, Movement.UP, Movement.LEFT)),
                Arguments.of(D3, B2, List.of(Movement.LEFT, Movement.LEFT, Movement.DOWN)),
                Arguments.of(D3, C1, List.of(Movement.DOWN, Movement.DOWN, Movement.LEFT))
        );
    }
}
