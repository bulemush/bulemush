package ClassText;
/*
如果一个质数 P 的每位数字都是质数, 而且每两个相邻的数字组成的两位 数是质数,
而且每三位相邻的数字组成的三位数是质数, 依次类推,
如果每相 邻的 k 位数字组成的 k 位数都是质数, 则 P 称为超级质数。

如果把超级质数 P 看成一个字符串, 则这个超级质数的每个子串都是质数。

例如, 53 是一个超级质数。请问, 最大的超级质数是多少?
 */
public class Superzhishu {
    public static void main(String[] args) {
        for (int i=1000000;i>1;i--){
            if (check(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean check(int num){
        String t = num+ "";//完美将整数转化成为字符串
        for (int i=0;i<t.length();i++){
            for (int j=i;j<t.length();j++) {
                int tmp = Integer.parseInt(t.substring(i, j+1));//将字串转换为数字
                if(!iszhishu(tmp)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean iszhishu(int i){
        if (i==1)
            return false;
        for (int n=2;n<=Math.sqrt(i);n++){
            if (i%n==0)
                return false;
        }
        return true;
    }

}