package application;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PlayWithStrings {
    public static void main(String[] args) {

        System.out.println("Hello String World");
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie Vorname ein: ");
        String vorName = scan.nextLine();

        System.out.println("Geben Sie Nachname ein: ");
        String nachName = scan.nextLine();

        printIntitials(vorName, nachName);

        System.out.println("Geben Sie das erste Wort ein ");
        String firstWord = scan.nextLine();

        System.out.println("Geben Sie das zweite Wort ein ");
        String secondWord = scan.nextLine();

        boolean isAnagram = areAnagrams(firstWord, secondWord);

        if (isAnagram) {
            System.out.println("Es gibt Anagram!");
        } else {
            System.out.println("Es gibt kein Anagram");
        }

        System.out.println("Geben Sie das  Wort ein - Palindrome Checker ");
        String palWortOderNein = scan.nextLine();

        boolean isPalindrom = isPalindrome(palWortOderNein);
        if (isPalindrom) {
            System.out.println("Das Wort ist Palindrom");
        } else {
            System.out.println("Das Wort ist kein Palindrom");
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
    public static void printIntitials(String firstname, String lastname) {
        StringBuilder sb = new StringBuilder();
        System.out.println(firstname + " " + sb.append(lastname));
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
    public static boolean areAnagrams(String value1, String value2) {
        StringBuffer sb = new StringBuffer(value1);
        StringBuffer sb2 = new StringBuffer(value2);
        char[] stringSort;
        char[] stringSort2;
        String newValue1 = "";
        String newValue2 = "";
        if (value1.contains(" ")) {
            // System.out.println("index of : " + sb.indexOf(" "));
            sb.deleteCharAt(sb.indexOf(" "));
            // System.out.println(sb);
        }

        value1 = sb.toString();
        stringSort = value1.toCharArray();
        Arrays.sort(stringSort);
        newValue1 = new String(stringSort);


        if (value2.contains(" ")) {
            // System.out.println("index of : " + sb2.indexOf(" "));
            sb2.deleteCharAt(sb2.indexOf(" "));
            //  System.out.println(sb2);
        }

        value2 = sb2.toString();
        stringSort2 = value2.toCharArray();
        Arrays.sort(stringSort2);
        newValue2 = new String(stringSort2);

        System.out.println(newValue1);
        System.out.println(newValue2);

        if (newValue1.equals(newValue2)) {

            return true;
        }
        return false;
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
    public static boolean isPalindrome(String value) {
        StringBuilder sb = new StringBuilder(value);
        String st = new String(sb.reverse().toString());
        if (value.equals(st)) {
            return true;
        }
        return false;
    }
}
