package battleship;

public class Validate {
	public static boolean boardValidator(String[][] board) {
		boolean yes = false;
		boolean R = false;
		boolean C = false;
		boolean B = false;
		boolean D = false;
		boolean S = false;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j].equals("C")&& !C) {
					if(board[i][j+4].equals("C")) {
						yes = true;
						C = true;
					}
					else if(board[i+4][j].equals("C")) {
						yes = true;
						C = true;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("B")&& !B) {
					if(board[i][j+2].equals("B")) {
						yes = true;
						B = true;
					}
					else if(board[i+2][j].equals("B")) {
						yes = true;
						B = true;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("R")&& !R) {
					if(board[i][j+2].equals("R")) {
						yes = true;
						R = true;
					}
					else if(board[i+2][j].equals("R")) {
						yes = true;
						R = true;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("S")&& !S) {
					if(board[i][j+2].equals("S")) {
						yes = true;
						S = true;
					}
					else if(board[i+2][j].equals("S")) {
						yes = true;
						S = true;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("D")&& !D) {
					if(board[i][j+2].equals("D")) {
						yes = true;
						D = true;
					}
					else if(board[i+2][j].equals("D")) {
						yes = true;
						D = true;
					}
					else
						yes = false;	
				}
				
			}
		}
		return yes;
	}
}
