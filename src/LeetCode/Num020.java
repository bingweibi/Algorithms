package LeetCode;

import java.util.Stack;

public class Num020 {

    public static void main(String[] args) {
        System.out.println(new Num020().isValid("{}{{}}"));
    }

    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        int n=s.length();
        if(n==0){
            return true;
        }
        for(int i=0;i<n;i++) {
            if(result.empty()){
                result.push(s.toCharArray()[i]);
            } else if(result.peek()=='('&&s.toCharArray()[i]==')'|| result.peek()=='['&&s.toCharArray()[i]==']'|| result.peek()=='{'&&s.toCharArray()[i]=='}'){
                result.pop();
            } else{
                result.push(s.toCharArray()[i]);
            }
        }
        return result.empty();
    }
}
