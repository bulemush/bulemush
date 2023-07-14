package ClassText;

import java.util.Scanner;

/*
如图p1.pgn所示的螺旋折线经过平面上所有整点恰好一次。
对于整点(X, Y)，我们定义它到原点的距离dis(X, Y)是从原点到(X, Y)的螺旋折线段的长度。

例如dis(0, 1)=3, dis(-2, -1)=9

给出整点坐标(X, Y)，你能计算出dis(X, Y)吗？
 */
public class Luoxuanzhexian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=0,b=0,len=1,lencount=0,sum=0;
        while (true){
            while (lencount<len){
                a--;
                lencount++;
                sum++;
                if (a==x && b==y){
                    System.out.println(sum);
                    return;
                }
            }
            lencount=0;
            while (lencount<len){
                b++;
                lencount++;
                sum++;
                if (a==x && b==y){
                    System.out.println(sum);
                    return;
                }
            }
            lencount=0;
            len++;
            while (lencount<len){
                a++;
                lencount++;
                sum++;
                if (a==x && b==y){
                    System.out.println(sum);
                    return;
                }
            }
            lencount=0;
            while (lencount<len){
                b--;
                lencount++;
                sum++;
                if (a==x && b==y){
                    System.out.println(sum);
                    return;
                }
            }
            lencount=0;
            len++;
        }
    }
}
