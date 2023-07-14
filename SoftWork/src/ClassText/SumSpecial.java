package ClassText;

import java.util.Scanner;

/*
小明对数位中含有 2、0、1、9 的数字很感兴趣（不包括前导 0），在 1 到 40 中这样的数包括 1、2、9、10 至 32、39 和 40，共 28 个，他们的和是 574。

请问，在 1 到 n 中，所有这样的数的和是多少？


 */
public class SumSpecial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            String s=String.valueOf(i);
            if (check(s))
                sum+=i;
        }
        System.out.println(sum);
    }
    public static boolean check(String s){
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(ch[i]=='2'||ch[i]=='0'||ch[i]=='1'||ch[i]=='9')
                return true;
        }
        return false;
    }
}
