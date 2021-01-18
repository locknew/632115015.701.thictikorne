/**thictikorne vin 632115015*/

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String word = "";
	
	do {
		System.out.println("Please enter the word:  enter quit to stop");
		word = input.next();
		System.out.println(word + (isPalindrome(word)?" is a palindrome.":" is not a palindrome."));
		}while(!word.equals("quit"));
		input.close();

	}

	
	public static boolean isPalindrome(String word) {
        return (word.equals(new StringBuilder(word).reverse().toString()));
    }
}