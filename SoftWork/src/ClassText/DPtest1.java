package ClassText;

import java.util.Scanner;

public class DPtest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] coin=new int[n+1][n+1];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                coin[i][j]=sc.nextInt();
        for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>=0;j--){
                coin[i][j]=Math.max(coin[i+1][j]+coin[i][j],coin[i][j+1]+coin[i][j]);
            }
        }
        System.out.println(coin[0][0]);
    }
}
