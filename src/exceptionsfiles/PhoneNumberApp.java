package exceptionsfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/PhoneNumber.txt";
		File file =new File(filename);
		String phoneNum = null;
		String[] phoneNums = new String[9];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
		for (int i=0; i<phoneNums.length; i++) {
				phoneNums[i] = br.readLine();
				
				
				try {
					if (phoneNums[i].length() != 10 ) {
						throw new TenDigitsException(phoneNums[i]);
					}
					if (phoneNums[i].substring(0, 1).equals("0") || phoneNums[i].substring(0, 1).equals("9")) {
						throw new AreaCodeException(phoneNums[i].substring(0, 1));
					}
					if (phoneNums[i].contains("911")) {
						throw new EmergencyException(phoneNums[i]);
					}
					System.out.println("Good Phone Number: "+ phoneNums[i]);
					
				} catch(TenDigitsException e) {
					System.out.println(e.toString());
					
				}  catch(AreaCodeException e) {
					System.out.println(e.toString());
					
				} catch(EmergencyException e) {
					System.out.println(e.toString());
					
				} 

		}
		br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			
		} catch (IOException e) {
			System.out.println("ERROR: could not read the data: " + filename);
			
		}
		
	}

}

class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return "TenDigitsException: A phone number has 10 digits. Your number is " + this.num +" and has "+this.num.length()+" digits.";	
		}
}
class AreaCodeException extends Exception {
	String areaCodeBegin;
	AreaCodeException(String num){
		this.areaCodeBegin = num;
	}
	public String toString() {
		return "AreaCodeException: Area code cannot start with 0 or 9. Your area code starts with "+ this.areaCodeBegin +"." ;	
	}
	
}
class EmergencyException extends Exception{
	String num;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString() {
		return "EmergencyException: A phone number cannot contain '911'. Your number is " + this.num;	
	}
	
}