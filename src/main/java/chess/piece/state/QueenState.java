package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.List;

public class QueenState extends Continuous {
    @Override
    public List<Movement> findMovablePath(Position beforePosition, Position afterPosition) {
        return findMovablePath(Movement.all(), beforePosition, afterPosition);
    }

    @Override
    public PieceState updateState() {
        return new QueenState();
    }
}
