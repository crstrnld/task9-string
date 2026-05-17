import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        SentenceAnalyzer analyzer = new SentenceAnalyzer(input);

        System.out.println("Total Characters: " + analyzer.getTotalCharacters());
        System.out.println("Total Words: " + analyzer.getTotalWords());
        System.out.println("Uppercase: " + analyzer.toUpperCase());
        System.out.println("Lowercase: " + analyzer.toLowerCase());
        System.out.println("Reverse: " + analyzer.getReverse());
        System.out.println("Vowels: " + analyzer.countVowels());
        System.out.println("Consonants: " + analyzer.countConsonants());
        System.out.println("Palindrome: " + (analyzer.isPalindrome() ? "Yes" : "No"));

        scanner.close();
    }
}