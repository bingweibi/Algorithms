package LeetCode;

public class Num318 {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(new Num318().maxProduct(words));
    }
    public int maxProduct(String[] words) {
        int maxLen = 0,len = words.length;
        for (int i=0;i<len;++i){
            for (int j=i+1;j<len;++j){
                if (findSame(words[i],words[j])){
                    int temp = words[i].length() * words[j].length();
                    maxLen = temp > maxLen ? temp:maxLen;
                }
            }
        }
        return maxLen;
    }

    private boolean findSame(String word, String word1) {
        for (int i=0;i<word.length();++i){
            if (word1.contains(""+ word.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
