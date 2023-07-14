package ClassText;

import java.util.Scanner;

/*
2020 年春节期间，有一个特殊的日期引起了大家的注意：2020 年 2 月 2 日。
因为如果将这个日期按 “yyyymmdd” 的格式写成一个 8 位数是 20200202，恰好是一个回文数。我们称这样的日期是回文日期。

有人表示 20200202 是 “千年一遇” 的特殊日子。对此小明很不认同，
因为不到 2 年之后就是下一个回文日期：20211202 即 2021 年 12 月 2 日。

也有人表示 20200202 并不仅仅是一个回文日期，还是一个 ABABBABA 型的回文日期。
对此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA 型的回文日期：21211212 即 2121 年 12 月 12 日。算不上 “千年一遇”，顶多算 “千年两遇”。

给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个 ABABBABA 型的回文日期各是哪一天。

输入包含一个八位整数 N，表示日期。

对于所有评测用例，10000101≤N≤89991231，保证 N 是一个合法日期的 8 位数表示。
 */
public class Huiwenriqi {
    public static int[] day={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static int flag1=0;
    public static int flag2=0;
    public static boolean ishuiwen(int num){
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        if(ch[0]==ch[7]&&ch[1]==ch[6]&&ch[2]==ch[5]&&ch[3]==ch[4])
            return true;
        return false;
    }
    public static boolean isab(int num){
        int year=num/10000;
        int data=num%10000;
        String s=String.valueOf(num);
        char[] ch=s.toCharArray();
        if(year%100==year/100 &&data%100==data/100 &&ch[0]==ch[7]&&ch[1]==ch[6])
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int huiwen=0;
        int ab=0;
        for(int i=N+1;i<89991231;i++){
            if (isexist(i)){
                if (ishuiwen(i)&&flag1==0){
                    huiwen=i;
                    flag1=1;
                }
                if (isab(i)&&flag2==0){
                    ab=i;
                    flag2=1;
                }
                if (flag1==1 &&flag2==1)
                    break;
            }
        }
        System.out.println(huiwen);
        System.out.println(ab);
    }
    public static boolean isexist(int data){
        int yearnum=data/10000;
        int monthnum=(data%10000)/100;
        int daynum=data%100;
        if (monthnum>=1&&monthnum<=12){
            if ((yearnum%4==0 &&yearnum%100!=0)||yearnum%400==0)
                day[2]=29;
            if (daynum>0 && daynum<=day[monthnum])
                return true;
        }
        return false;
    }
}
