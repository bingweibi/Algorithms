package LeetCode;

/**
 * @author bibingwei
 *
 *
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，
 * 换言之就是判断它是否会移回到原来的位置。
 *
 * 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。
 * 机器人有效的动作有 R（右），L（左），U（上）和 D（下）。
 * 输出应为 true 或 false，表示机器人移动路线是否成圈。
 *
 * 输入: "UD"
 * 输出: true
 *
 * 输入: "LL"
 * 输出: false
 */
public class Num657 {
    public static void main(String[] args) {
        System.out.println(new Num657().judgeCircle("LL"));
    }
    public boolean judgeCircle(String moves) {
        boolean flag = false;
        int i=0,j=0;
        char[] movesChar = moves.toCharArray();
        for (char aMovesChar : movesChar) {
            if (aMovesChar == 'R') {
                ++j;
            } else if (aMovesChar == 'L') {
                --j;
            } else if (aMovesChar == 'U') {
                ++i;
            } else if (aMovesChar == 'D') {
                --i;
            }
        }
        if (i==0 && j==0){
            flag = true;
        }
        return flag;
    }
}
