

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Heatmap {
	
	private String[][] data;
	
	public Heatmap(int rows, int cols, String filename) throws IOException{
		data = new String[rows][cols];
		
		File file = new File(filename);
		Scanner scan1 = new Scanner(file);
		int count = 0;
		String [][] hehe = new String[rows][cols];
		while(scan1.hasNextLine()) {
			int row = 0;
			String line = scan1.nextLine();
			if(line.substring(0, 1).equals("c")) {
				continue;
			}
			String[] he = line.split(",");
			for(int col = 0; col < he.length; col++) {
				hehe[col][row] = he[col];
			}
			row++;
			data = hehe;
		}
	}
	public void printHeatmap() {
		for(int i = 0; i <data.length; i ++) {
			for(int j = 0; j < data[i].length; j ++) {
				if(j == data.length - 1) {
					System.out.print(data[i][j]);
				}
				System.out.println(data[i][j]+",");
			}
		}
			
	}
}
