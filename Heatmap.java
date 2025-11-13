

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Heatmap {
	
	private double[][] data;
	
	public Heatmap(int rows, int cols, String filename) throws IOException{
		data = new double[rows][cols];
		
		File file = new File(filename);
		Scanner scan1 = new Scanner(file);
		double [][] hehehe = new double[rows][cols];
		double[] hehe = new double[rows];
		int row = 0;
		while(scan1.hasNextLine()) {
			String line = scan1.nextLine();
			if(line.substring(0, 1).equals("c")) {
				continue;
			}

			String[] he = line.split(",");

			for(int i = 1; i <he.length; i++) {
				hehe[i - 1] = Double.parseDouble(he[i]);
			}
			for(int col = 0; col < he.length - 1; col++) {
				hehehe[col][row] = hehe[col];
			}
			row++;
			data = hehehe;
		}
		scan1.close();
	}
	public void printHeatmap() {
		for(int i = 0; i <data.length; i ++) {
			for(int j = 0; j < data[i].length; j ++) {
				if(j == data.length - 1) {
					System.out.print(data[i][j]);
				}
				else
					System.out.print(data[i][j]+",");
			}
			System.out.println();
		}
			
	}
	public double sumHeatmap() {
		double sum = 0;
		for(int i = 0; i <data.length; i ++) {
			for(int j = 0; j < data[i].length; j ++) {
				sum += data[i][j];
			}
		}
		return sum;
	}
	public double avgHeatmap() {
		double sum = sumHeatmap();
		int tot = data.length * data[0].length; 
		sum /= tot;
		return sum;
	}
	public double sumColumn(int col) {
		double sum = 0;
		for(int i = 0; i < data.length; i ++) {
			sum += data[col][i];
		}
		return sum;
	}
	public double sumRow(int row) {
		double sum = 0;
		for(int i = 0; i < data.length; i ++) {
			sum += data[i][row];
		}
		return sum;
	}
	public int areCold() {
		int tot = 0;
		for(int i = 0; i <data.length; i ++) {
			for(int j = 0; j < data[i].length; j ++) {
				if(data[i][j] < 10) {
					tot ++;
				}
			}
		}
		return tot;
	}
	
}
