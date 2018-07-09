package LeetCode;

public class Num278 {
    public static void main(String[] args) {
        System.out.println();
    }
    public int firstBadVersion(int n) {
        int low=1,high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
//            if(isBadVersion(mid)) {
//                high=mid-1;
//            } else {
//                low=mid+1;
//            }
        }
        return low;
    }
}
