/*Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel or Consonant, depending on the user input. 
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.*/
package same;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String x = in.next();

        boolean uppercase = x.charAt(0) >= 65 && x.charAt(0) <= 90;
        boolean lowercase = x.charAt(0) >= 97 && x.charAt(0) <= 122;
        boolean vowels = x.equals("a") || x.equals("e") || x.equals("i")
                || x.equals("o") || x.equals("u");

        if (x.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
	}

}
