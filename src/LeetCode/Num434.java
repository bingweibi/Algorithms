package LeetCode;

public class Num434 {
    public int countSegments(String s) {
        int count=0;
        String[] strings = s.split(" ");
        for (String s1 :strings){
            if (!s1.equals("")){
                count++;
            }
        }
        return count;
    }
}
