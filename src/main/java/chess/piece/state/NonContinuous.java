package chess.piece.state;

import static chess.Movement.createMovablePaths;

import chess.Movement;
import chess.Position;
import java.util.ArrayList;
import java.util.List;

public abstract class NonContinuous extends StartedPieceState {

    public List<Movement> findMovablePath(List<Movement> movements, Position beforePosition, Position afterPosition) {
        List<Movement> movablePaths = new ArrayList<>();
        for (Movement movement : movements) {
            if (beforePosition.canMoveTo(movement, afterPosition)) {
                movablePaths = createMovablePaths(movement);
            }
        }
        if (movablePaths.isEmpty()) {
            throw new IllegalStateException("해당 기물이 이동 가능한 경로가 없습니다.");
        }
        return movablePaths;
    }
}
