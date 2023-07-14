package ClassText;

import java.util.Scanner;

/*
爱丽丝要完成一项修剪灌木的工作。有 N 棵灌木整齐的从左到右排成一排。爱丽丝在每天傍晩会修剪一棵灌木,
让灌木的高度变为 0 厘米。爱丽丝修剪灌木的顺序是从最左侧的灌木开始, 每天向右修剪一棵灌木。
当修剪了最右侧的灌木后, 她会调转方向, 下一天开 始向左修剪灌木。直到修剪了最左的灌木后再次调转方向。然后如此循环往复。

灌木每天从早上到傍晩会长高 1 厘米, 而其余时间不会长高。在第一天的早晨, 所有灌木的高度都是 0 厘米。爱丽丝想知道每棵灌木最高长到多高。

输入格式
一个正整数 N, 含义如题面所述。

输出格式
输出 N 行, 每行一个整数, 第 i 行表示从左到右第i棵树最高能长到多高。
 */
public class Tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int t=N;
        int count=0;
        for(int i=0;i<(N+1)/2;i++){
            System.out.println(2*(t-1));
            t--;
            count++;
        }
        if (N%2==1){
            t+=2;
            for (int i=0;i<count-1;i++){
                System.out.println(2*(t-1));
                t++;
            }
        }
        else {
            t++;
            for (int i=0;i<count;i++){
                System.out.println(2*(t-1));
                t++;
            }
        }
    }
}
