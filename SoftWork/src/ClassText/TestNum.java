package ClassText;

import java.util.Scanner;

/*
x星球的居民脾气不太好，但好在他们生气的时候唯一的异常举动是：摔手机。
各大厂商也就纷纷推出各种耐摔型手机。x星球的质监局规定了手机必须经过耐摔测试，并且评定出一个耐摔指数来，之后才允许上市流通。

x星球有很多高耸入云的高塔，刚好可以用来做耐摔测试。塔的每一层高度都是一样的，与地球上稍有不同的是，他们的第一层不是地面，而是相当于我们的2楼。

如果手机从第7层扔下去没摔坏，但第8层摔坏了，则手机耐摔指数=7。
特别地，如果手机从第1层扔下去就坏了，则耐摔指数=0。
如果到了塔的最高层第n层扔没摔坏，则耐摔指数=n

为了减少测试次数，从每个厂家抽样3部手机参加测试。

某次测试的塔高为1000层，如果我们总是采用最佳策略，在最坏的运气下最多需要测试多少次才能确定手机的耐摔指数呢？
 */
public class TestNum {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] dp = new int[n + 5][m + 5];
        //dp[i][j]表示还有i层未测，j个手机没碎
        for (int i = 1; i <= n; i++) {
            dp[i][1] = i;//只有一个手机还有i层没测最坏的情况下需要i次
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j][i] = dp[j - 1][i] + 1;//还有j层，i个手机，推一下，相当于j-1层i个手机，多测一次
                for (int k = 2; k <= j; k++) {
                    dp[j][i] = Math.min(dp[j][i], Math.max(dp[k - 1][i - 1], dp[j - k][i]) + 1);
                    //在第k层摔坏了 dp[k-1][i-1]  (下面k-1层，用i-1个手机去测试）
                    //在第k层没坏  dp[j-k][i]  (上面的j-k层，用i个手机去测）
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
