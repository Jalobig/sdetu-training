package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class labs4 {

	public static void main(String[] args) {
		String filename = "/Users/jasonalexis/Documents/Udemy/Java/Files/CreditCardStatement.csv";
		String row;
		List<String[]> data= new ArrayList<String[]>();
		File file = new File(filename);
		double balance = 0;
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
			double amount = Double.parseDouble(account[3]);
			if (account[1].strip().equals("CREDIT")) {
				balance= balance + amount;
			} else {
				balance= balance - amount;
			}
		}
		
		if(balance > 0) {
			System.out.println("Your balance before 10% charge: "+String.format("%.2f", balance));
			balance *= 1.1;
			System.out.println("Your total balance: "+String.format("%.2f", balance));
			
		}else if (balance == 0){
			
			System.out.println("Account paid in full. Balance at 0. Thank you for your payment.");
			
		} else {
			System.out.println("Thank you for your payment. You have overpayment.");
			System.out.println("Your current balance: "+String.format("%.2f", balance));
		}
		
	}

}
