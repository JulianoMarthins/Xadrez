import boardGame.Board;
import boardGame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMath = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMath.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPostion(sc);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPostion(sc);

                ChessPiece capturePiece = chessMath.performChessMove(source, target);

            }
            catch(ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();

            }
        }

    }
}