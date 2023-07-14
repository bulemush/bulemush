package ClassText;

import java.util.Scanner;

public class Del {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long count=0;
        long sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            count+=a[i];
        }
        for(int i=0;i<n;i++){
            count-=a[i];
            sum+=count*a[i];
        }
        System.out.println(sum);
        scan.close();
    }
}
