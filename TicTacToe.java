/**
 * TicTacToe
 */

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args)
    {
        char[][] board = {
            {
                ' ', ' ', ' '
            }, {
                ' ', ' ', ' '
            }, {
                ' ', ' ', ' '
            }
        };

        printBoard(board);
    }

    public static void printBoard(char[][] board)
    {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static int promptMove()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose a space to move: 1-9:");
        int move = myObj.nextInt();
        return move;
    }
}