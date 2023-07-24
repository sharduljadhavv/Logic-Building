import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class tictactoe {
    public static void main(String [] args)
    {
        char board[][]=new char[3][3];
        
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in)
        while(!gameOver)
        {
            printBoard(board);
            System.out.println("player"+player+"enter");
            int row=sc.nextInt();
            int col=sc.nextInt();
            
            if(board[row][col])==''{
                board[row][col]=player;
                gameOver=haveWon(board, player);
                if(gameOver){
                    System.out.println("player"+player+"won");
                }
                else{
                    player=(player=='X')?'O':'X';
                }
            }else {
                System.out.println("invalid move,Try Again!");
            }



        }
        printBoard(board);

    }
    public static void haveWon(char[][] Board,char player)
    {

    }
    public static void printBoard(char[][] Board)
    {
        for(int row=0;row<Board.length;row++){
            for(int col=0;col<Board.length;col++){
                Board[row][col]=' ';
                System.out.print(Board[row][col]+" ");
            }
            System.out.println();
        }

    }


    
}
