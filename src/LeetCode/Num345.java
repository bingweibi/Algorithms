package LeetCode;

public class Num345 {
    public static void main(String[] args) {
        System.out.println(new Num345().reverseVowels("Ui"));
    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        char temp;
        while (start < end) {
            if (checkVowel(ch[start]) && checkVowel(ch[end])) {
                temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;
                start++;
                end--;
            } else {
                if (!checkVowel(ch[start])) {
                    start++;
                }
                if (!checkVowel(ch[end])) {
                    end--;
                }
            }
        }
        return new String(ch);
    }
    public static boolean checkVowel(char c) {
        return 'a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
                || 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c;
    }
}
