package exceptionsfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1. Define the files (path) that we want to read
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/FileToRead.txt";
		String text = null;
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			// 4. Read the file 
			text = br.readLine();
			// 5. Close the file
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: could not read the data: " + filename);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finished reading the file.");
		}
		System.out.println(text);
		
	}

}
