package LeetCode;

import java.util.Arrays;

public class Num744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char targets = 'k';
        System.out.println(new Num744().nextGreatestLetter(letters,targets));
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        char result = 0;
        if (target >= letters[len-1] || target < letters[0]){
            return letters[0];
        }else {
            for (char letter : letters) {
                if (letter - target > 0) {
                    result = letter;
                    break;
                }
            }
        }
        return result;
    }
}
