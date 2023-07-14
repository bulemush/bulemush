package Mathtest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        for (int i=min;i<=max;i++){
            if (iszhishu(i)&&ishuiwen(i))
                System.out.print(i+" ");
        }
    }
    public static boolean iszhishu(int num){
        if (num==1)
            return false;
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0)
                return false;
        }
        return true;
    }
    public static boolean ishuiwen(int num){
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length/2;i++){
            if (ch[i]!=ch[ch.length-1-i])
                return false;
        }
        return true;
    }
}
