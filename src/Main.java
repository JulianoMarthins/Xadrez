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
                UI.printMath(chessMath);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPostion(sc);

                boolean[][] possibleMoves = chessMath.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMath.getPieces(), possibleMoves);


                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPostion(sc);

                ChessPiece capturePiece = chessMath.performChessMove(source, target);

            } catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();

            }
        }
    }
}