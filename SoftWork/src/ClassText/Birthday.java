package ClassText;
/*
某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
现在算起来，他一共吹熄了236根蜡烛。请问，他从多少岁开始过生日party的？请
填写他开始过生日party的年龄数。注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 */
public class Birthday {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (472%(i+1)==0){
                int t=472/(i+1);
                if ((t-i)%2==0){
                    int x=(t-i)/2;
                    if(x>0&&x<100)
                        System.out.println(x);
                }
            }
        }
    }
}