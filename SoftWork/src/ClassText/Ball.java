package ClassText;

import java.util.Arrays;
import java.util.Scanner;

/*
两个人玩取球的游戏。一共有N个球，每人轮流取球，每次可取集合{n1,n2,n3}中的任何一个数目。如果无法继续取球，则游戏结束。此时，持有奇数个球的一方获胜。
如果两人都是奇数，则为平局。假设双方都采用最聪明的取法，第一个取球的人一定能赢吗？试编程解决这个问题。

输入格式：

第一行3个正整数n1 n2 n3，空格分开，表示每次可取的数目 (0<n1,n2,n3<100)
第二行5个正整数x1 x2 ... x5，空格分开，表示5局的初始球数(0<xi<1000)
输出格式：

一行5个字符，空格分开。分别表示每局先取球的人能否获胜。能获胜则输出+，次之，如有办法逼平对手，输出0，无论如何都会输，则输出-
例如，输入：

1 2 3
1 2 3 4 5
程序应该输出：

+ 0 + 0 -
再例如，输入：

1 4 5
10 11 12 13 15
程序应该输出：

0 - 0 + +
再例如，输入：

2 3 5
7 8 9 10 11
程序应该输出：

+ 0 0 0 0
再例如，输入：

1 7 8
900 901 903 905 907
程序应该输出：

0 + - - +

 */
public class Ball {
    public static int[] num;
    private static Character[][][] map = new Character[1000][2][2];

    public static char play(int cnt,int cur,int next){
        if (map[cnt][cur][next]!=null)
            return map[cnt][cur][next];
        if (cnt < num[0]) {// 无法继续取球则直接判定结果
            if ((cur & 1) == 1 && (next & 1) == 0)
                return '+';
            if ((cur & 1) == 0 && (next & 1) == 1)
                return '-';
            return '0';
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++)
            num[i]=sc.nextInt();
        Arrays.sort(num);
        for (int n=0;n<5;n++){
            System.out.print(play(sc.nextInt(),0,0)+" ");
        }
    }
}
