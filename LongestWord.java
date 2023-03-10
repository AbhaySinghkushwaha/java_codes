Rohit is pursuing his B.Tech degree in CSE. His java teacher given the assignment to write java code to accept a string/sentence in upper case if the string/sentence in not upper case than convert it in uppercase and Display the longest word and the length of the longest word present in the string. If the string contains number or string is null then display the massage “Invalid input”.
Sample 1:
Enter string: Lovely Professional University
Longest word : PROFESSIONAL

Sample 2:
Enter string: 123 cse 45 lpu 56789
Invalid input

Input Format
First line read the input as String

Constraints
numbers of word in string > 1

Output Format
Display longest string in Uppercase

Sample Input 0
Lovely Professional University

Sample Output 0
PROFESSIONAL

//                          <CODE>




import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.matches(".*\\d.*") || input.equals("")) {
            System.out.println("Invalid input");
            return;
        }
        String uppercaseInput = input.toUpperCase();
        String[] words = uppercaseInput.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for(String word : words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        sc.close();
    }

}
