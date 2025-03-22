package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.List;

public class KnightState extends NonContinuous {
    @Override
    public List<Movement> findMovablePath(Position beforePosition, Position afterPosition) {
        return findMovablePath(Movement.knight(), beforePosition, afterPosition);
    }

    @Override
    public PieceState updateState() {
        return new KnightState();
    }
}
