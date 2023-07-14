package ClassText;

import java.util.Scanner;

/*
输入格式： 第一行包含一个整数N。 (1 <= N <= 1000) 。以下N行N列代表一张海域照片。 照片保证第1行、第1列、第N行、第N列的像素都是海洋。
输出格式： 一个整数表示答案。
输入样例：
7
.......
.##....
.##....
....##.
..####.
...###.
.......
输出样例： 1
 */
public class Land {
    public static char[][] map;
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        map=new char[N][N];
        sc.nextLine();
        for (int i=0;i<N;i++){
            String line=sc.nextLine();
            map[i]=line.toCharArray();
        }
        char[][] mapcopy=map;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (map[i][j]=='#')
                    count++;
            }
        }
        sub(N,mapcopy);
        System.out.println(count);
    }
    public static void sub(int N,char[][] mapcopy){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if (map[i][j]=='#'){
                    if (mapcopy[i+1][j]=='.'){
                        count--;
                        continue;
                    }
                    if (mapcopy[i-1][j]=='.'){
                        count--;
                        continue;
                    }
                    if (mapcopy[i][j+1]=='.'){
                        count--;
                        continue;
                    }
                    if (mapcopy[i][j-1]=='.'){
                        count--;
                    }
                }
            }
        }
    }
}
