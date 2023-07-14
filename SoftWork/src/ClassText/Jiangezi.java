package ClassText;

import java.util.Scanner;

public class Jiangezi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        dfs(0,0);
    }
    public static void dfs(int i,int j){

    }
}
