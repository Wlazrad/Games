package calculator1;

import java.util.Scanner;

public class Main {

    public static int col;
    public static int row;
    public static char turn='X';
    public static char tab[][]= new char[3][3];
    public static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        for (int i =0; i<3;i++){
            for (int j = 0 ; j<3;j++){
                tab[i][j]='_';
            }
        }
        Play();


    }

    public static void Play(){
        boolean playing = true;
        while (playing){

            row=scan.nextInt()-1;
            col=scan.nextInt()-1;
            tab[row][col]=turn;

            if (GameOver(row,col)){
                System.out.println("!!!!! "+turn+"wins");
                playing=false;
            }
            Plansza();
            if(turn=='X')
                turn='O';
            else turn='X';

        }
    }
    public static void Plansza(){
        for (int i = 0; i<3;i++){
            System.out.println();
            for(int j =0; j<3;j++){
                if(j==0)
                    System.out.print("| ");

                System.out.print(tab[i][j]+" | ");


            }
        }
    }
    public static boolean GameOver(int rMove, int cMove){
        if (tab[0][cMove]==tab[1][cMove]&&tab[0][cMove]==tab[2][cMove])
        return true;
        if (tab[rMove][0]==tab[rMove][1]&&tab[rMove][0]==tab[rMove][2])
        return true;
        if(tab[0][0]==tab[1][1]&&tab[2][2]==tab[0][0]&&tab[0][0]!='_')
        return true;
        if(tab[0][2]==tab[1][1]&&tab[0][2]==tab[2][0]&&tab[0][2]!='_')
        return true;
else return false;
    }
}
