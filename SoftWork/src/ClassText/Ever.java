package ClassText;
/*
1/1 + 1/2 + 1/4 + 1/8 + 1/16 + .... 每项是前一项的一半，如果一共有20项，求这个和是多少，结果用分数表示出来。

类似：3/2。当然，这只是加了前2项而已。分子分母要求互质。

注意：需要提交的是已经约分过的分数，中间任何位置不能含有空格。请不要填写任何多余的文字或符号。

 */
public class Ever {
    public static void main(String[] args) {
        int a=(int)Math.pow(2,19);
        int cur=a;
        int count=a;
        for (int n=0;n<19;n++){
            cur=cur/2;
            count+=cur;
        }
        System.out.println(count+"/"+a);
    }
}
