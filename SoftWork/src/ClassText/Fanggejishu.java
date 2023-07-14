package ClassText;

public class Fanggejishu {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=1000;i++){
            for (int j=1;j<=1000;j++){
                if (Math.sqrt(i*i+j*j)<=1000)
                    count++;
            }
        }
        System.out.println(4*count);
    }
}
