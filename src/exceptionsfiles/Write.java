package exceptionsfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/FileToWrite.txt";
		String message = "I'm writing this message to a file from a Java program.";
		// 2. Create the file in Java
		File file = new File(filename);
		
		try {
			// 3. Open the file 
			FileWriter fw = new FileWriter(file);
			// 4. write to the file
			fw.write(message);
			
			// 5. close the file
			fw.close();
			
		} catch (IOException e) {
			System.out.println("ERROR: could not read the file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}
		

	}

}
