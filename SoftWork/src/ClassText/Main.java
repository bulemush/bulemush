package ClassText;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] num;
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str=scan.next();
            char[] ch=str.toCharArray();
            num=new int[26];
            int n;
            for(int i=0;i<ch.length;i++){
                n=ch[i]-'a';
                num[n]++;
            }
            int max=0;
        for (int i=1;i<25;i++){
            if (num[max]<num[i])
                max=i;
        }
        System.out.println((char)(max+'a'));
        System.out.println(num[max]);
            scan.close();
        }
    }

