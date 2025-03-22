package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.List;

public class PawnState extends NonContinuous {
    @Override
    public List<Movement> findMovablePath(Position beforePosition, Position afterPosition) {
        // 수정
        return findMovablePath(List.of(Movement.UP, Movement.DOWN), beforePosition, afterPosition);
    }

    @Override
    public PieceState updateState() {
        return new PawnState();
    }
}
