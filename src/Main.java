import java.util.*;

/**
 * @author bibingwei
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] L = new int[n];
        int[] V = new int[n];
        for(int i = 0; i < n; i++){
            L[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            V[i] = sc.nextInt();
        }
        Main tree = new Main();
        tree.solvePostOrder(0,0,L.length,L,V);
    }



    /**
     * 已知前序遍历，中序遍历，求后序遍历
     * @param preStart
     * @param inStart
     * @param length
     */
    public void solvePostOrder(int preStart,int inStart,int length,int[] L,int[] V){
        if (length<=0) {
            return;
        }
        int v = L[preStart];
        int len = getLength(inStart,length,v,V);
        solvePostOrder(preStart+1,inStart,len,L,V);
        solvePostOrder(preStart+len+1,inStart+len+1,length-len-1,L,V);
        System.out.print(v+" ");

    }


    public int getLength(int start,int length,int v,int[] V){
        for (int i = start,count = 0; count<length; i++,count++){
            if (V[i] == v) {
                return count;
            }
        }
        return 0;
    }
}


