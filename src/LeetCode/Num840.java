package LeetCode;

public class Num840 {
    public static void main(String[] args) {
        int[][] grid = {{1,8,6},{10,5,0},{4,2,9}};
        System.out.println(new Num840().numMagicSquaresInside(grid));
    }
    private int judge(int x,int y,int [][] g)
    {
        int[] a = new int[10];
        for(int i=x;i<x+3;i++)
        {
            for(int j=y;j<y+3;j++)
            {
                //System.out.print(g[i][j]+" ");
                if(g[i][j]>=10 || g[i][j]<=0) return 0;
                a[g[i][j]]++;
                if( a[g[i][j]]>1) return 0;
            }
            //System.out.println();
        }

        int sum =-1,tmp=0;
        for(int i=x;i<x+3;i++)
        {
            tmp=0;
            for(int j=y;j<y+3;j++)
            {
                tmp+=g[i][j];
            }
            if(sum==-1) sum=tmp;
            else if(sum!=tmp) return 0;
        }

        for(int j=y;j<y+3;j++)
        {
            tmp=0;
            for(int i=x;i<x+3;i++)
            {
                tmp+=g[i][j];
            }
            if(sum!=tmp) return 0;
        }

        tmp = g[x][y]+g[x+1][y+1]+g[x+2][y+2];
        if(sum!=tmp) return 0;
        tmp = g[x][y+2]+g[x+1][y+1]+g[x+2][y];
        if(sum!=tmp) return 0;

        return 1;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res=0;
        for(int i=0;i+2<n;i++)
        {
            for(int j=0;j+2<m;j++)
            {
                res+=judge(i,j,grid);
            }
        }
        return res;
    }

}
