//A program in which the user can enter any word or phrase with special characters and spaces.
//The computer will remove all special characters and determine whether or not the phrase is a palindrome. 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PalindromeMain {
	
	public static boolean Palindrome() {
		ArrayList<String> specialCharacters = new ArrayList<String>(Arrays.asList(",", " ", ".", "?", "!", "/", "|", "%", "&", "$", "(", ")", ":", ";", "-", "_", "'"));
		String forwards = ""; //Original input
		String backwards = ""; //Input flipped backwards
		int length; //Variable to store how long the input of the user is
		
		Scanner keyboard = new Scanner(System.in);
		
		//Sets the forwards input equal to the input from the user
		System.out.println("Enter a palindrome, we will tell you if it is true or false: ");
		forwards = keyboard.nextLine();
		
		
		//For each special character it will replace it with nothing
		for (String badChar: specialCharacters) {
			forwards = forwards.replace(badChar, "");
		}
		
		//Set length of phrase equal to length
		length = forwards.length();
		
		//Reads the forwards string backwards and sets backwards equal to the reverse of forwards
		for (int i = length - 1; i >= 0; i--) {
			backwards = backwards + forwards.charAt(i);
			}
		
		//If backwards is equal to forwards then it will return true for the palindrome, and if not then it will return false
		if (forwards.equalsIgnoreCase(backwards)) {
			System.out.println("Original text: " + forwards);
			System.out.println("Backwards text: " + backwards);
			return true;
		} else {
			System.out.println("Original text: " + forwards);
			System.out.println("Backwards text: " + backwards);
			return false;
		}
	}
	
	public static void main(String[] args) {	
		String input;
		Scanner keyboard = new Scanner(System.in);
		
		//A loop that executes the question and the palindrome checker everytime until the user enters something else
		do {
			System.out.println(Palindrome());
			System.out.println(" ");
			System.out.println("Enter continue to keep playing or any other character to stop: ");
			input = keyboard.nextLine();
		}
		while (input.equalsIgnoreCase("continue"));
		
		
			
	}
}

