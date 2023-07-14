package ClassText;
/*
有一堆煤球，堆成三角棱锥形。具体： 第一层放1个，第二层3个（排列成三角形），
第三层6个（排列成三角形），第四层10个（排列成三角形），.... 如果一共有100层，
共有多少个煤球？请填表示煤球总数目的数字。
 */
public class Tou {
    public static void main(String[] args) {
        int count=0;
        int number=0;
        for(int i=1;i<=100;i++){
            number+=i;
            count+=number;
        }
        System.out.println(count);
    }
}
