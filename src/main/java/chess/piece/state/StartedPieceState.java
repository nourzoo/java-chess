package chess.piece.state;

public abstract class StartedPieceState implements PieceState {
    @Override
    public PieceState captured() {
        return new CapturedState();
    }
}
