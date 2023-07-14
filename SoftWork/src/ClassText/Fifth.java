package ClassText;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=sc.nextInt();
        int ans=0;
        int[][] marked=new int[n+1][m+1];
        int[] r1=new int[t];
        int[] r2=new int[t];
        int[] c1=new int[t];
        int[] c2=new int[t];
        for (int i=0;i<t ;i++ ){
            r1[i]=sc.nextInt();
            c1[i]=sc.nextInt();
            r2[i]=sc.nextInt();
            c2[i]=sc.nextInt();
        }
        for (int i=1;i<n+1 ;i++ ){
            for(int j=1;j<m+1;j++){
                for(int num=0;num<t;num++){
                    if (i>=r1[num]&&i<=r2[num]&&j>=c1[num]&&j<=c2[num]&&marked[i][j]!=1){
                        ans++;
                        marked[i][j]=1;
                    }
                }
            }
        }
        System.out.println(m*n-ans);

    }
}
