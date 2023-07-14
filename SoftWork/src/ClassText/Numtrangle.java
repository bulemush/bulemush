package ClassText;

import java.util.Scanner;

public class Numtrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n+1][n+1];
        int[][] dp=new int[n+1][n+1];
        for (int i=1;i<n+1;i++){
            for (int j=1;j<i+1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        dp[1][1]=a[1][1];
        for (int i=2;i<n+1;i++){
            for (int j=1;j<i+1;j++){
                dp[i][j]=Math.max(dp[i-1][j-1]+a[i][j],dp[i-1][j]+a[i][j]);
            }
        }
        if(n%2==0){
            System.out.println(Math.max(dp[n][n/2],dp[n][n/2+1]));
        }else {
            System.out.println(dp[n][n/2+1]);
        }
    }
}
