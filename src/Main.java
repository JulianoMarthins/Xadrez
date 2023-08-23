import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMath = new ChessMatch();

        while (true) {
            UI.printBoard(chessMath.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPostion(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPostion(sc);

            ChessPiece capturePiece = chessMath.performChessMove(source, target);

        }

    }
}