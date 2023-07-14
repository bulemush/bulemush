package ClassText;
/*
对于一个日期，我们可以计算出年份的各个数位上的数字之和，也可以分别计算月和日的各位数字之和。
请问从 1900 年 1 月 1 日至 9999 年 12 月 31 日，总共有多少天，年份的数位数字之和等于月的数位数字之和加日的数位数字之和。
　　例如，2022年11月13日满足要求，因为 2+0+2+2=(1+1)+(1+3) 。
　　请提交满足条件的日期的总数量。

 */
public class Second {
    public static int[] day;
    public static void main(String[] args) {
        int year;
        int month;
        int ans=0;
        day=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
         for (year=1900;year<10000;year++){
             int yearnum=0;
             int monthnum=0;
             int daynum=0;
             int temp=year;
             for (int i=0;i<4;i++){
                 yearnum+=temp%10;
                 temp=temp/10;
             }
             if(year%4==0 &&year%100!=0){
                 day[2]=29;
             }
             if (year%400==0)
                 day[2]=29;
             for (month=1;month<13;month++){
                     monthnum=month%10+month/10;
                 for (int i=1;i<=day[month];i++){
                     daynum=i%10+i/10;
                     if (yearnum==monthnum+daynum)
                         ans++;
                 }
             }
                day[2]=28;
         }
         System.out.println(ans);
    }
}
