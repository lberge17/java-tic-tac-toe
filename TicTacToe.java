/**
 * TicTacToe
 */

import java.util.Scanner;

public class TicTacToe {
    public static boolean gameOver = false;

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

        playGame(board);
    }

    public static void playGame(char[][] board)
    {
        Scanner myObj = new Scanner(System.in);
        while (!gameOver)
        {
            printBoard(board);
            System.out.println("Choose a space to move: 1-9:");
            int move = myObj.nextInt();
            if (makeMove(move, board))
            {
                printBoard(board);
            }
            else 
            {
                System.out.println("Invalid move. Try again.");
            }
        }
        myObj.close();
    }

    public static void printBoard(char[][] board)
    {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static boolean makeMove(int move, char[][] board)
    {
        switch (move) {
            case 1:
                if (board[0][0] == ' ')
                {
                    board[0][0] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 2:
                if (board[0][1] == ' ')
                {
                    board[0][1] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 3:
                if (board[0][2] == ' ')
                {
                    board[0][2] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 4:
                if (board[1][0] == ' ')
                {
                    board[1][0] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 5:
                if (board[1][1] == ' ')
                {
                    board[1][1] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 6:
                if (board[1][2] == ' ')
                {
                    board[1][2] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }
                
            case 7:
                if (board[2][0] == ' ')
                {
                    board[2][0] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 8:
                if (board[2][1] == ' ')
                {
                    board[2][1] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }

            case 9:
                if (board[2][2] == ' ')
                {
                    board[2][2] = 'x';
                    return true;
                }
                else
                {
                    return false;
                }
        
            default:
                return false;
        }
    }
}