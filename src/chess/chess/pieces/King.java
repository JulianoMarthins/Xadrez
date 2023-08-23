package chess.chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    public String toString(){

        return "K";
    }
}
