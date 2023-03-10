Write a program to check whether two strings are ANAGRAM or not. Strings will be anagram if they have same set of characters same number of times. Your program should take the input of two strings of length greater than 2. If the length of the any string is less than equal 2 then display the message “Invalid Input” without taking any more input.

Input Format
Your program should take the input of two strings.

Constraints
Length of strings should be greater than 2.

Output Format
Your program should display the “ANAGRAM” or “NOT ANAGRAM” depending on the input strings.

Sample Input 0
silent
listen

Sample Output 0
ANAGRAM

Sample Input 1
ssilent
listenn

Sample Output 1
NOT ANAGRAM



//              <CODE>



import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


        if(s1.length() <= 2 || s2.length() <= 2) {
            System.out.println("Invalid Input");
            return;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();


        Arrays.sort(s1Array);
        Arrays.sort(s2Array);


        if(Arrays.equals(s1Array, s2Array)) {
            System.out.println("ANAGRAM");
        } else {
            System.out.println("NOT ANAGRAM");
        }

        sc.close();
    }

}
