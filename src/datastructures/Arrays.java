package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = { "a", "b", "c", "d", "e","f","g"};
		
		System.out.println("Using the old fashioned method");
		for (int i=0; i<6; i++) {
			System.out.print(alphabet[i] + " ");
			
		}
		
		System.out.println("\nUsing Length parameter method");
		for(int i = 0; i<alphabet.length; i++){
			System.out.print(alphabet[i] + " ");
		}
		
		System.out.println("\nUsing For-Each method");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		System.out.println("\n\nTwo dimensional Arrays");
		String[][] users = {
				{"John", "Williams","jw@testemail.com", "8946325894"},
				{"Sarah", "Jackson","sj@testemail.com", "4568478466"},
				{"Rachel", "Thompson","rt@testemail.com", "5648468748"}
		};
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println(numOfUsers);
		System.out.println(numOfFields);
	}

}
