package tickTackTo;

import java.util.Scanner;

public class TickTak {
	public static int Hor, Ver;
	public static Scanner scan = new Scanner(System.in);
	public static char [][] board = new char [3][3];
	static char turn = 'X' ;

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j]= '_';

			}
		}

		play();
	}    


	

	public static  void play() {
		boolean playing = true ;
		printBord();
		System.out.println("schreib ein Hor Ver ");
		while(true){
			Ver = scan.nextInt();
			Hor = scan.nextInt() ;

			board[Ver][Hor] = turn;
			if (isWin(Hor,Ver)){
				playing =false;
				System.out.println("end spiel " +turn );
			}
			printBord();
			if (turn == 'X'){
				turn =  'O';}
			else {
				turn = 'X';}

		}

	}


	public static void printBord(){
		for ( int i = 0 ; i<3 ; i++){
			System.out.println();
			for( int j = 0; j<3 ;j++){
				if (j == 0)
					System.out.print("| ");
				System.out.print(board[i][j]+" | ");
			}
		}
		System.out.println();
	}
	public static  boolean isWin( int rMove, int cMove){
		 boolean st = false;
		if (board[0][cMove] == board[1][cMove]&&
				board[0][cMove] == board[2][cMove])
			st = true;
		if (board[rMove][0] == board[rMove][1]&&
				board[rMove][0] == board[rMove][2])
			st = true;
		if (board[0][0] == board[1][1]&&
				board[0][0]==board[2][2]&& 
				board [1][1] != '-')
			st = true;
		if (board[0][2] == board[1][1]&&
				board[0][2] == board[2][0]&& 
				board[1][1] != '-')
			st = true;
		return st;
	}

}

