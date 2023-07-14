package ClassText;
/*
现在小学的数学题目也不是那么好玩的。看看这个寒假作业：

□ + □ = □

□ - □ = □

□ × □ = □

□ ÷ □ = □

每个方块代表1~13中的某一个数字，但不能重复。比如：

6 + 7 = 13

9 - 8 = 1

3 * 4 = 12

10 / 2 = 5

以及：

7 + 6 = 13

9 - 8 = 1

3 * 4 = 12

10 / 2 = 5

就算两种解法（加法，乘法交换律后算不同的方案）。你一共找到了多少种方案？请填写表示方案数目的整数。注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 */
public class Samll {
    public static int count;
    public static int[] num;
    public static boolean[] marked;
    public static void dfs(int idx){
        if(idx>11){
            count++;
            return;
        }
        for(int n=1;n<14;n++){
            if (!marked[n]){
                if(idx==10 && num[idx-1]%n!=0)
                    continue;;
                if (idx==2 && num[idx-2]+num[idx-1]!=n)
                    continue;
                if (idx==5 && num[idx-2]+num[idx-1]!=n)
                    continue;
                if (idx==8 && num[idx-2]*num[idx-1]!=n)
                    continue;
                if (idx==11 && num[idx-2]/num[idx-1]!=n)
                    continue;
                num[idx]=n;
                marked[n]=true;
                dfs(idx+1);
                marked[n]=false;
            }
        }
    }
    public static void main(String[] args) {
        num=new int[12];
        marked=new boolean[14];
        dfs(0);
        System.out.println(count);
    }
}
