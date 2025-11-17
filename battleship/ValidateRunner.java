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
		while(scan1.hasNextLine()) {
			line = scan1.nextLine();
			int row = 0;
			String[] row1 = line.split(",");
			if(row1.length == 10) {
				for(int col = 0; col < row1.length - 1; col++) {
					board1[col][row] = row1[col];
				}
					row ++;
			}
			else
				yes = false;
			
		}
		count2++;
		if(count2 != 10) {
			yes =false;
		}
		if(yes) {
			yes = Validate.boardValidator(board1);		
		}
		if(yes) {
			System.out.println("This board is Valid.");
		}
		else
			System.out.println("This board is not Valid.");

		
		
		
		
		
		scan1.close();
	}
}
