import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNuml = scanner.nextLine();
        int result = romanToInteger(romanNuml);
        System.out.println("Integer value: " + result);
        
        System.out.print("Enter another Roman Numeral: ");
        romanNuml = scanner.nextLine();
        result = romanToInteger(romanNuml);
        System.out.println("Integer value: " + result);
        
        scanner.close();
    }
    
    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(s.charAt(i));
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }
            prevValue = curValue;
        }
        
        return result;
    }
}
