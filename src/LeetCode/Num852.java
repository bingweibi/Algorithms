package LeetCode;

public class Num852 {
    public static void main(String[] args) {
        int[] a= {0,2,1,0};
        System.out.println(new Num852().peakIndexInMountainArray(a));
    }
    public int peakIndexInMountainArray(int[] A) {

        int max = A[0],len = A.length,result = 0;
        for (int i=1;i< len;i++){
            if (A[i]>max){
                max = A[i];
            }else {
                result =  i-1;
                break;
            }
        }
        return result;
    }
}
