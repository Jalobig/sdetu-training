package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/ReadCSVFile.csv";
		String row;
		List<String[]> data= new ArrayList<String[]>();
		File file = new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while ((row = br.readLine()) != null) {
				String[] line = row.split(",");
				data.add(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			
		} catch (IOException e) {
			System.out.println("ERROR: could not read the data: " + filename);
			
		}
		
		for(String[] account: data ) {
			System.out.print("[");
			for(String cell : account) {
				System.out.print(cell + ", ");
			}
			System.out.println("]");
		}
	}

}
