package ClassText;

import java.util.Scanner;

public class Sipingfang {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
            int n = scan.nextInt();
            for(int a=0;a*a<=n;a++){
                for(int b=a;a*a+b*b<=n;b++){
                    for(int c=b;a*a+b*b+c*c<=n;c++){
                        for(int d=c;a*a+b*b+c*c+d*d<=n;d++){
                            if(a*a+b*b+c*c+d*d==n){
                                System.out.println(a+" "+b+" "+c+" "+d);
                                return;
                            }
                        }
                    }
                }
            }
            scan.close();
        }
}
