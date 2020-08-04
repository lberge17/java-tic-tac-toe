/**
 * TicTacToe
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
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
        while (!gameOver(board))
        {
            printBoard(board);
            System.out.println("Choose a space to move: 1-9:");
            int move = myObj.nextInt();
            if (makeMove(move, board, 'x'))
            {
                playerPositions.add(move);
                printBoard(board);
                if (gameOver(board))
                {
                    break;
                }
                else
                {
                    cpuMove(board);
                }
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

    public static boolean makeMove(int move, char[][] board, char player)
    {
        switch (move) {
            case 1:
                if (board[0][0] == ' ')
                {
                    board[0][0] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 2:
                if (board[0][1] == ' ')
                {
                    board[0][1] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 3:
                if (board[0][2] == ' ')
                {
                    board[0][2] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 4:
                if (board[1][0] == ' ')
                {
                    board[1][0] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 5:
                if (board[1][1] == ' ')
                {
                    board[1][1] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 6:
                if (board[1][2] == ' ')
                {
                    board[1][2] = player;
                    return true;
                }
                else
                {
                    return false;
                }
                
            case 7:
                if (board[2][0] == ' ')
                {
                    board[2][0] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 8:
                if (board[2][1] == ' ')
                {
                    board[2][1] = player;
                    return true;
                }
                else
                {
                    return false;
                }

            case 9:
                if (board[2][2] == ' ')
                {
                    board[2][2] = player;
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

    public static void cpuMove(char[][] board)
    {
        Random n = new Random();
        int move = n.nextInt(9) + 1;
        if (makeMove(move, board, 'o')) {
            cpuPositions.add(move);
        }
        else
        {
            cpuMove(board);
        }
    }

    public static boolean gameOver(char[][] board)
    {
        List<Integer> top = Arrays.asList(1, 2, 3);
        List<Integer> middleRow = Arrays.asList(4, 5, 6);
        List<Integer> bottom = Arrays.asList(7, 8, 9);
        List<Integer> left = Arrays.asList(1, 4, 7);
        List<Integer> middleCol = Arrays.asList(2, 5, 8);
        List<Integer> right = Arrays.asList(3, 6, 9);
        List<Integer> diag1 = Arrays.asList(1, 5, 9);
        List<Integer> diag2 = Arrays.asList(3, 5, 7);

        List<List<Integer>> winningPositions = new ArrayList<List<Integer>>();

        winningPositions.add(top);
        winningPositions.add(middleCol);
        winningPositions.add(bottom);
        winningPositions.add(left);
        winningPositions.add(middleRow);
        winningPositions.add(right);
        winningPositions.add(diag1);
        winningPositions.add(diag2);

        for(List<Integer> lis : winningPositions)
        {
            if(playerPositions.containsAll(lis))
            {
                System.out.println("Congrats! You win!");
                return true;
            }
            else if(cpuPositions.containsAll(lis))
            {
                System.out.println("Game over. You lose. :(");
                return true;
            }
            else if (playerPositions.size() + cpuPositions.size() == 9)
            {
                System.out.println("Cat's game!");
                return true;
            }
            else
            {
                return false;
            }
        }

        return false;
    }
}