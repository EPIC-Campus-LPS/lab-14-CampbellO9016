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
		scan.close();
		//Board making
		File file = new File(filename);
		Scanner scan1 = new Scanner(file);
		String line = "";
		boolean yes = false;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			int row = 0;
			String[] row1 = line.split(",");
			if(row1.length == 10) {
				
			for(int col = 0; col < row1.length - 1; col++) {
				board1[col][row] = row1[col];
			}
			}
			else
				yes = true;
			
		}
		if(yes) {
			System.out.println("This board is not Valid.");
		}
		else
			System.out.println("This board is Valid.");

		
		
		
		
		
		scan1.close();
	}
}
