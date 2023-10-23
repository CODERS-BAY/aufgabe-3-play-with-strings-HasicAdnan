package application;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PlayWithStrings {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        printIntitials();

        if (areAnagrams()) {
        } else {
            System.out.println("Es gibt kein Anagram");
        }

        if (isPalindrome()) {
            System.out.println("Es gibt Palindrome");
        } else {
            System.out.println("Es gibt keine Palindrome");
        }
    }

    /**
     * TODO: print initials
     * <p>
     * This method should print out the initials of a name to standard out.
     *
     * @param firstname
     * @param lastname
     */
    public static void printIntitials() {
        System.out.println("Geben Sie Vorname ein: ");
        String vorName = scan.nextLine();

        System.out.println("Geben Sie Nachname ein: ");
        String nachName = scan.nextLine();

        System.out.println(vorName.toUpperCase().charAt(0) + ". " + nachName.toUpperCase().charAt(0) + ".");
    }

    /**
     * TODO: check for anagrams
     * <p>
     * This method should determine if two strings are anagrams or not An anagram is
     * a word or a phrase made by transposing the letters of another word or phrase.
     * For example, "parliament" is an anagram of "partial men," and "software" is
     * an anagram of "swear oft." The program should ignore white space and
     * punctuation.
     *
     * @param value1
     * @param value2
     * @return true if the values are anagrams, false otherwise.
     */
    public static boolean areAnagrams() {
        System.out.println("Geben Sie das erste Wort ein ");
        String value1 = scan.nextLine();

        System.out.println("Geben Sie das zweite Wort ein ");
        String value2 = scan.nextLine();

        value1 = value1.replaceAll(" ", "");
        value2 = value2.replaceAll(" ", "");

        String newValue1 = sortString(value1);
        String newValue2 = sortString(value2);


        if (newValue1.equals(newValue2)) {
            System.out.println("Es gibt Anagram!");
            return true;
        }
        return false;
    }

    public static String sortString(String a) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        String aa = new String(c);
        return aa;
    }


    /**
     * TODO: palindrone checker
     * <p>
     * This method should find out if a string value is a palindrome or not. A
     * palindrome is a sequence of characters (can also be a number) which reads the
     * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
     * bees in a cave?
     * <p>
     * Upper or lower case should not matter, but keep the white spaces, tabs and
     * punctuation in mind.
     *
     * @param value
     * @return true if it is a palindrome, false otherwise.
     */
    public static boolean isPalindrome() {
        System.out.println("Geben Sie das  Wort ein - Palindrome Checker ");
        String palWortOderNein = scan.nextLine();
        char[] c = palWortOderNein.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = c[c.length - i - 1];
        }
        String palWortOderNein2 = new String(c);
        if (palWortOderNein.equals(palWortOderNein2)) {
            return true;
        }
        return false;
    }
}
