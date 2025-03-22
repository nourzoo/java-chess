package chess;

import java.util.ArrayList;
import java.util.List;

public enum Movement {
    UP(0, 1),
    UP_UP(UP.x * 2, UP.y * 2),
    DOWN(0, -1),
    DOWN_DOWN(DOWN.x * 2, DOWN.y * 2),
    LEFT(-1, 0),
    RIGHT(1, 0),

    // Diagonal
    LEFT_UP(LEFT.x, UP.y),
    RIGHT_UP(RIGHT.x, UP.y),
    LEFT_DOWN(LEFT.x, DOWN.y),
    RIGHT_DOWN(RIGHT.x, DOWN.y),

    // Knight
    UP_UP_LEFT(LEFT_DOWN.x, UP_UP.y),
    UP_UP_RIGHT(RIGHT_DOWN.x, UP_UP.y),
    LEFT_LEFT_UP(LEFT.x * 2, UP.y),
    LEFT_LEFT_DOWN(LEFT.x * 2, DOWN.y),
    RIGHT_RIGHT_UP(RIGHT.x * 2, UP.y),
    RIGHT_RIGHT_DOWN(RIGHT.x * 2, DOWN.y),
    DOWN_DOWN_LEFT(LEFT_DOWN.x, DOWN_DOWN.y),
    DOWN_DOWN_RIGHT(RIGHT_DOWN.x, DOWN_DOWN.y),
    ;

    private final int x;

    private final int y;

    Movement(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public boolean isVertical() {
        return x == 0 && y != 0;
    }

    public boolean isDiagonal() {
        return x != 0 && y != 0 && Math.abs(x) == Math.abs(y);
    }

    // Knight
    public static List<Movement> knight() {
        List<Movement> movements = new ArrayList<>();
        movements.add(UP_UP_LEFT);
        movements.add(UP_UP_RIGHT);
        movements.add(LEFT_LEFT_UP);
        movements.add(LEFT_LEFT_DOWN);
        movements.add(RIGHT_RIGHT_UP);
        movements.add(RIGHT_RIGHT_DOWN);
        movements.add(DOWN_DOWN_LEFT);
        movements.add(DOWN_DOWN_RIGHT);
        return movements;
    }

    // Bishop
    public static List<Movement> diagonal() {
        List<Movement> movements = new ArrayList<>();
        movements.add(LEFT_UP);
        movements.add(RIGHT_UP);
        movements.add(LEFT_DOWN);
        movements.add(RIGHT_DOWN);
        return movements;
    }

    // Rook
    public static List<Movement> upDownLeftRight() {
        List<Movement> movements = new ArrayList<>();
        movements.add(UP);
        movements.add(DOWN);
        movements.add(LEFT);
        movements.add(RIGHT);
        return movements;
    }

    // King, Queen
    public static List<Movement> all() {
        List<Movement> movements = new ArrayList<>();
        movements.addAll(diagonal());
        movements.addAll(upDownLeftRight());
        return movements;
    }

    public static List<Movement> createMovablePaths(Movement movement) {
        int x = movement.x;
        int y = movement.y;

        List<Movement> newMovements = new ArrayList<>();

        if (Math.abs(x) < Math.abs(y)) {
            return getMovements(x, y, newMovements, DOWN, UP, LEFT, RIGHT);
        }
        return getMovements(y, x, newMovements, LEFT, RIGHT, DOWN, UP);
    }

    private static List<Movement> getMovements(int x, int y, List<Movement> newMovements, Movement movement2,
                                               Movement movement3, Movement movement4, Movement movement5) {
        for (int i = 0; i < Math.abs(y); i++) {
            if (y < 0) {
                newMovements.add(movement2);
            } else if (y > 0) {
                newMovements.add(movement3);
            }
        }
        for (int i = 0; i < Math.abs(x); i++) {
            if (x < 0) {
                newMovements.add(movement4);
            } else if (x > 0) {
                newMovements.add(movement5);
            }
        }
        return newMovements;
    }
}
