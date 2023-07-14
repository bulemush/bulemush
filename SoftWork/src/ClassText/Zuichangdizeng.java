package ClassText;

import java.util.Scanner;

public class Zuichangdizeng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        int count=1;
        int max=count;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i=1;i<n;i++){
            if (a[i]>a[i-1]){
                count++;
                if (count>max)
                    max=count;
            }
            else {
                count=1;
            }
        }
        System.out.println(max);
    }
}
