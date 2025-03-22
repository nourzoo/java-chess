package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.ArrayList;
import java.util.List;

public abstract class Continuous extends StartedPieceState {

    public List<Movement> findMovablePath(List<Movement> movements, Position beforePosition, Position afterPosition) {
        Movement direction = selectDirection(movements, beforePosition, afterPosition);

        List<Movement> movablePaths = new ArrayList<>();
        while (!beforePosition.equals(afterPosition)) {
            beforePosition.move(direction);
            movablePaths.add(direction);
        }
        return movablePaths;
    }

    private Movement selectDirection(List<Movement> movements, Position beforePosition, Position afterPosition) {
        Movement direction = null;
        for (Movement m : movements) {
            direction = beforePosition.getCorrectMovement(m, afterPosition);
        }
        if (direction == null) {
            throw new IllegalStateException("해당 위치로 이동할 수 없습니다.");
        }
        return direction;
    }
}
