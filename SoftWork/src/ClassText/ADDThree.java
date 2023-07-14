package ClassText;

import java.util.Arrays;
import java.util.Scanner;

public class ADDThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        long count=0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int p=0;
        int q=0;
        for (int i=0;i<n;i++){
            while (p<n&&a[p]<b[i])
                p++;
            while (q<n&&c[q]<=b[i])
                q++;
            count+=(long) (p*(n-q));
        }
        System.out.println(count);
    }
}

/*
4
1 2 3 4
2 3 4 5
3 4 5 6
 */