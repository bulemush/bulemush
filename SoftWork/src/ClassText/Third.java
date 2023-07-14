package ClassText;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int n=sc.nextInt();
        int real=n%7;
        int today;
        if (real+w>7)
            today=(real+w)%7;
        else
            today=real+w;
        System.out.println(today);

    }
}
