package Mathtest;


/**
 *小明被劫持到X赌城，被迫与其他3人玩牌。一副扑克牌（去掉大小王牌，共52张），
 *均匀发给4个人，每个人13张。这时，小明脑子里突然冒出一个问题：如果不考虑花色，
 *只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 *请填写该整数，不要填写任何多余的内容或说明文字。
 */
public class Six {
    private static int ans;

    private static void f(int points, int sum) {
        if (points == 13 && sum == 13) {
            ans++;
            return;
        }
        if (points < 13 && sum <= 13)
            for (int i = 0; i <= 4; i++)
                f(points + 1, sum + i);
    }

    public static void main(String[] args) {
        f(0, 0);
        System.out.println(ans);
    }
}
