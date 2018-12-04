package ox;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TTT {

    public static int row,col;
    public static Scanner scan = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char turn ='X';

    public static void main(String[] args) {
        for (int i = 0; i<3;i++){
            for (int j=0; j<3; j++){
                board[i][j] = '_';
            }
        }

        PrintBoard();
    }

    public static void PrintBoard(){
        for (int i = 0; i<3; i++) {
            System.out.println();
            for (int j=0; j<3; j++){
                if (j==0)
                    System.out.print("| ");
                System.out.print(board[i][j]+" | ");
            }
        }
        Play();
    }
    public static void Play(){
        boolean playing = true;
        while (playing) {
            System.out.println("Please enter a row and column: ");
            row = scan.nextInt() -1;
            col = scan.nextInt() -1;
            board[row][col] =turn;
            if(GameOver(row, col)){
                playing =false;
                System.out.println("Game over ! Player "+turn+"wins!");
            }
            PrintBoard();
            if (turn =='X')
                turn ='O';
            else
                turn='X';

        }
    }

    public static boolean GameOver (int rMove, int cMove){

        if (board[0][cMove]==board[1][cMove]
                && board[0][cMove]==board[2][cMove])
            return true;
        if (board[rMove][0]==board[rMove][1]
                && board[rMove][0] == board[rMove][1])
            return true;
        if (board[0][0]==board[1][1] && board[0][0]==board[2][2]
                && board[1][1]!='_')
            return true;
        if (board[0][2]==board[1][1] && board[0][2]==board[2][0]
                && board[1][1] !='_')
            return true;
        return false;
    }


}

