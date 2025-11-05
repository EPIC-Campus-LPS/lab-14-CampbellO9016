package part1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Heatmap {
	
	private double[][] data;
	
	public Heatmap(int rows, int cols, String filename) throws IOException{
		data = new double[rows][cols];
		
		File file = new File("heatmap_20x20.csv");
		Scanner scan1 = new Scanner(file);
		int count = 0;
		String [] words = new String[190];
		int num = 0;
		while(scan1.hasNextLine()) {
			words[num] = scan1.nextLine();
			num ++;
		}
	}
}
