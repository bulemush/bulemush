package ClassText;

import java.util.Scanner;
import java.util.Arrays;

// 1:无需package
// 2: 类名必须Main, 不可修改

public class Findnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int copy[]=Arrays.copyOfRange(num,0,n);
        int[] need=new int[n];
        Arrays.sort(num);
        int choice=num[n/2];
        int max=0;
        int min=0;
        for (int i=0;i<n;i++){
            if (num[i]>choice)
                max++;
            if (num[i]<choice)
                min++;
        }
        for (int i=0;i<n;i++){
            if (copy[i]<choice && min>max){
                need[i] =choice - copy[i];
            }
            else  if (copy[i]<choice && min<=max){
                need[i]=choice-copy[i]+1;
            }
            else if(copy[i]==choice &&min<max)
                need[i]=1;
            else {
                need[i]=0;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(need[i] + " ");
        }
    }
}