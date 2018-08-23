package LeetCode;

public class Num443 {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(new Num443().compress(chars));
    }
    public int compress(char[] chars) {
        int indexCount = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexCount++] = currentChar;
            if(count != 1) {
                for(char c : String.valueOf(count).toCharArray()) {
                    chars[indexCount++] = c;
                }
            }
        }
        return indexCount;
    }
}
