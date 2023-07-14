package ClassText;

import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int n=sc.nextInt();
        int R=sc.nextInt();
        int[][] point=new int[w+1][h+1];
        int[] x=new int[n];
        int[] y=new int[n];
        int ans=0;
        for (int i=0;i<n ;i++ ){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        for (int i=0;i<w+1;i++){
            for (int j=0;j<h+1;j++){
                for (int num=0;num<n;num++){
                    if (Math.sqrt((Math.pow(i-x[num],2))+Math.pow(j-y[num],2))<=R && point[i][j]!=1){
                        ans++;
                        point[i][j]=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
