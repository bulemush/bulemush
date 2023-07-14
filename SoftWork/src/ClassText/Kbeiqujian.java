package ClassText;

import java.util.Scanner;

public class Kbeiqujian {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int K=input.nextInt();
        int count[]=new int [1000001];
        int arr[]=new int[N+1];
        int s[]=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=input.nextInt();
            s[i]=s[i-1]+arr[i];    //计算前缀和
            s[i]%=K;      //在这里直接对前缀和取摸
        }
        count[0]=1;
        long anscount=0;  //int 会爆掉

        for(int i=1;i<=N;i++)
        {
            anscount+=count[s[i]];//除了count[0]=1,其余的初始值都为0，
            count[s[i]]++;       //如果出现过一次后加1，出现过两次及以上，anscount++,
            //我们就是要找总共有多少对,
            //只出现一次虽然count[i]加1但总的答案不会加
        }
        System.out.println(anscount);
    }
}