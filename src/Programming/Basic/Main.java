package Programming.Basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    /*Write a value-returning method, isVowel that returns the value true if a given character is a vowel,
    and otherwise returns false. In main() method accept a string from user and count number of vowels in that string. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter;
        for (;;) {
            System.out.println("Enter a Capitalletter: ");
            letter = input.next();
            System.out.println("Is this a vowel?");
            System.out.println(isVowel(letter));
        }
    }

    public static boolean isVowel (String exampleLetter) {
        if (exampleLetter.equalsIgnoreCase("A") || exampleLetter.equalsIgnoreCase("E") || exampleLetter.equalsIgnoreCase("I")|| exampleLetter.equalsIgnoreCase("O") || exampleLetter.equalsIgnoreCase("U")) {
            return true;
        } else return false;
    }
}
