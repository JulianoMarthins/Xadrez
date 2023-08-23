package chess;

import boardGame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are for A1 to H8.");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), (8 - position.getRow()));
    }

    public char getColumn() {
        return column;
    }


    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "" + column + row;
    }


}
