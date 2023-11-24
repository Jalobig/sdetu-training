package exceptionsfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordVerificatorApp {

	public static void main(String[] args) {
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/Passwords.txt";
		File file =new File(filename);
		String password = null;
		String[] passwords = new String[13];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwords.length;i++) {
				passwords[i]=br.readLine().trim();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			
		} catch (IOException e) {
			System.out.println("ERROR: could not read the data: " + filename);
			
		}
		
		for (int i=0; i<passwords.length; i++) {
			try {
				char[] chars = passwords[i].toCharArray();
				StringBuilder num = new StringBuilder();
				StringBuilder letter = new StringBuilder();
				StringBuilder specialChar = new StringBuilder();
				
				for(char c : chars){
					if(Character.isDigit(c)){
						num.append(c);
					}
					else if(Character.isAlphabetic(c)) {
						letter.append(c);
					}
					else {
						specialChar.append(c);
					}
				}
				if (num.isEmpty()) {
					throw new NoNumberException(passwords[i]);
				}
				if (letter.isEmpty()) {	
					throw new NoLetterException(passwords[i]);
				}
				if (specialChar.isEmpty()) {
					throw new NoSpecialCharException(passwords[i]);
				}
				
				System.out.println("Good password: " + passwords[i]);
			} catch (NoNumberException e) {
				System.out.println(e.toString());
			} catch (NoLetterException e) {
				System.out.println(e.toString());
			} catch (NoSpecialCharException e) {
				System.out.println(e.toString());
			}
			
		}
	}

}

class NoNumberException extends Exception{
	String password;
	NoNumberException(String pass){
		this.password = pass;
	}
	public String toString() {
		return "NoNumberException: The password needs at least one number. Your password: " + this.password;
	}
}
class NoLetterException extends Exception{
	String password;
	NoLetterException(String pass){
		this.password = pass;
	}
	public String toString() {
		return "NoLetterException: The password needs at least one letter. Your password: " + this.password;
	}
}
class NoSpecialCharException extends Exception{
	String password;
	NoSpecialCharException(String pass){
		this.password = pass;
	}
	public String toString() {
		return "NoSpecialCharException: The password needs at least one special character. Your password: " + this.password;
	}
}