package chess.piece.state;

import chess.Movement;
import chess.Position;
import java.util.List;

public interface PieceState {
    List<Movement> findMovablePath(Position beforePosition, Position afterPosition);

    PieceState captured();

    PieceState updateState();

}
