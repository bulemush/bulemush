package ClassText;

import java.util.Scanner;

public class Sixth {
    public static int n;
    public static int m;
    public static int max=0;
    public static int num;
    public static int[][] high;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        high=new int[n+2][m+2];
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                high[i][j]=sc.nextInt();
            }
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                num=1;
                dfs(i,j);
            }
        }
        System.out.println(max);
    }
    public static void dfs(int i,int j){

        if (((high[i+1][j]>=high[i][j]) || (i==n))&&((high[i-1][j]>=high[i][j]) || (i==1))&&((high[i][j-1]>=high[i][j]) || (j==1))&&((high[i][j+1]>=high[i][j]) ||(j==m))){
            if (max<num)
                max=num;
            num--;
            return;
        }
        if (i<n){
            if (high[i+1][j]<high[i][j]){
                num++;
                dfs(i+1,j);
            }
        }
        if (i-1>0){
            if (high[i-1][j]<high[i][j]){
                num++;
                dfs(i-1,j);
            }
        }
        if (j<m){
            if (high[i][j+1]<high[i][j]){
                num++;
                dfs(i,j+1);
            }
        }
        if (j-1>0){
            if (high[i][j-1]<high[i][j]){
                num++;
                dfs(i,j-1);
            }
        }
        num--;
    }
}