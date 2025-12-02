package battleship;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ValidateRunner {
	private String board[][];
	
	public static void main(String arg[]) throws IOException{
		//Input
		Scanner scan = new Scanner(System.in);
		System.out.print("Intput: ");
		String filename = scan.nextLine();
		//Board making
		File file = new File(filename);
		Scanner scan1 = new Scanner(file);
		String line = "";
		int count2 = 0;
		String[][] board1 = new String[10][10];
		boolean yes = true;
		boolean yes2 = true;
		boolean yes3 = false;
		int row = 0;
		while(scan1.hasNextLine()) {
			line = scan1.nextLine();
			String[] row1 = line.split(",");
			if(row1.length == 10) {
				for(int col = 0; col < row1.length; col++) {
					board1[row][col] = row1[col];
				}
					row ++;
			}
			else {
				yes = false;
			}
			count2++;
		}
//		for(String[] n: board1) {
//			for(String n1: n) {
//				System.out.print(n1);
//			}
//			System.out.println();
//		}
		
		if(count2 != 10) {
			yes =false;
		}
		if(yes) {
			yes = Validate.boardValidator(board1);		
		}
		if(yes) {
			System.out.println("This board is Valid.");
		}
		else {
			System.out.println("This board is not Valid.");
			yes2 = false;
		}
		
		if(yes2) {
			yes3 = Validate.balanced(board1);
			
			if(yes3)
				System.out.println("This board is Balanced.");
			else
				System.out.println("This board is not Balanced.");
				
		}

		
		
		
		
		
		scan1.close();
	}
}
