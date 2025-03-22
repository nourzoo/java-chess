package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.List;

public class CapturedState implements PieceState {
    @Override
    public List<Movement> findMovablePath(Position beforePosition, Position afterPosition) {
        throw new IllegalStateException("이미 잡힌 기물입니다.");
    }

    @Override
    public PieceState captured() {
        throw new IllegalStateException("이미 잡힌 기물입니다.");
    }

    @Override
    public PieceState updateState() {
        throw new IllegalStateException("이미 잡힌 기물입니다.");
    }
}
