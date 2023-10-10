import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(sentence);
        
        System.out.println(isPangram ? "The sentence is a pangram." : "The sentence is not a pangram.");
        
        scanner.close();
    }
    
    public static boolean checkPangram(String sentence) {
        Set<Character> uniqueChars = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }
        
        return uniqueChars.size() == 26;
    }
}
