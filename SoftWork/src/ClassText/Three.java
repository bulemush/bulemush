package ClassText;
/*
小明最近喜欢搭数字积木，一共有10块积木，每个积木上有一个数字，0~9。搭积木规则：

每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。最后搭成4层的金字塔形，必须用完所有的积木。下面是两种合格的搭法：

0

1 2

3 4 5

6 7 8 9

0

3 1

7 5 2

9 8 6 4

请你计算这样的搭法一共有多少种？请填表示总数目的数字。注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 */
public class Three {
    private static int[][] block;
    private static boolean[] marked;
    private static int ans;
    public static void dfs(int i,int j){
        if (i>3){
            ans++;
            return;
        }
        for(int n=1;n<10;n++){
            if(!marked[n]){
                if (n<block[i-1][j])
                    continue;
                if (j>0&&n<block[i-1][j-1])
                    continue;
                block[i][j]=n;
                marked[n]=true;
                if (i==j)
                    dfs(i+1,0);
                else
                    dfs(i,j+1);
                marked[n]=false;
            }
        }
    }
    public static void main(String[] args) {
        block=new int[4][4];
        marked=new boolean[10];
        dfs(1,0);
        System.out.println(ans);
    }
}
