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
        int move = promptMove();
        makeMove(move, board);
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
        myObj.close();
        return move;
    }

    public static void makeMove(int move, char[][] board)
    {
        switch (move) {
            case 1:
                board[0][0] = 'x';
                break;

            case 2:
                board[0][1] = 'x';
                break;

            case 3:
                board[0][2] = 'x';
                break;

            case 4:
                board[1][0] = 'x';
                break;

            case 5:
                board[1][1] = 'x';
                break;

            case 6:
                board[1][2] = 'x';
                break;

            case 7:
                board[2][0] = 'x';
                break;

            case 8:
                board[2][1] = 'x';
                break;

            case 9:
                board[2][2] = 'x';
                break;
        
            default:
                break;
        }
    }
}