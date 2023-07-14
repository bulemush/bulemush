package ClassText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChengjiMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long[] a=new long[n];
        int max=0;
        for (int i=0;i<0;i++){
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        if (n==0){

        }
        else {
            for (int i=0;i<k;i++){
                max*=a[i];
            }
        }
    }
}
