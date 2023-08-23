package chess;

import boardGame.BoardException;

public class ChessException extends BoardException {

    private static final float serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }

}
