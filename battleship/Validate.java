package battleship;

public class Validate {
	public static boolean boardValidator(String[][] board) {
		boolean yes = false;
		int R = 0;
		int C = 0;
		int B = 0;
		int D = 0;
		int S = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j].equals("C")&& i + 4 < 10 && j + 4 < 10) {
					if(C <= 1 && board[i][j+4].equals("C")) {
						yes = true;
						C ++;
					}
					else if(C <= 1 && board[i+4][j].equals("C")) {
						yes = true;
						C ++;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("B")&& i + 3 < 10 && j + 3 < 10) {
					if( B <= 1 &&board[i][j+3].equals("B")) {
						yes = true;
						B ++;
					}
					else if(B <= 1 &&board[i+3][j].equals("B")) {
						yes = true;
						B ++;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("R")&& i + 2 < 10 && j + 2 < 10) {
					if(R <= 1 && board[i][j+2].equals("R")) {
						yes = true;
						R ++;
					}
					else if(R <= 1 &&board[i+2][j].equals("R")) {
						yes = true;
						R ++;
					}
					else 
						yes = false;
					
						
				}
				if(board[i][j].equals("S")) {
					if(j + 2 < 10 && S <= 1 &&board[i][j+2].equals("S")) {
						yes = true;
						S ++;
					}
					else if(i + 2 < 10 && S <= 1 &&board[i+2][j].equals("S") ) {
						yes = true;
						S ++;
					}
					else
						yes = false;	
				}
				if(board[i][j].equals("D")&& i + 1 < 10 && j + 1 < 10) {
					if(D <= 1 &&board[i][j+1].equals("D")) {
						yes = true;
						D ++;
					}
					else if(D <= 1 &&board[i+1][j].equals("D")) {
						yes = true;
						D ++;
					}
					else
						yes = false;	
				}
				
			}
		}
		if(C+B+R+S+D == 5) {
			yes = true;
		}
		else
			yes = false;
		return yes;
	}
	public static boolean balanced(String[][] board) {
		for(int i = 0; i < board.length; i++) {
			String str = "";
			for(int j = 0; j < board[i].length; j++) {
				if(!(board[i][j].equals("0"))) {
					if(str.length() > 2) {
						return false;
					}
					if(str.contains(board[i][j])) {
						continue;
					}
					else {
						str+=board[i][j];
					}
				}
			}
		}
		for(int k = 0; k < 10 && k< board[k].length; k++) {
			String str = "";
			for(int j = 0; j < board.length; j++) {
//				System.out.print(board[j][k]);
				if(!(board[j][k].equals("0")) || j == 9) {
					
					if(str.length() > 2) {
						return false;
					}
					if(str.contains(board[j][k])) {
						continue;
					}
					else {
						str+=board[j][k];
					}
				}
				
			}
		}
		return true;
	}
}
