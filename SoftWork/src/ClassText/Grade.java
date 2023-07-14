package ClassText;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] grade=new int[n];
        int pass=0;
        int excellent=0;
        for (int i=0;i<n;i++){
            grade[i]=scan.nextInt();
        }
        for (int i=0;i<n;i++){
            if(grade[i]>=60){
                pass++;
                if (grade[i]>=85)
                    excellent++;
            }
        }
        double p1 = (pass*1.0) / n;
        double p2 = (excellent*1.0) / n;
        System.out.println(Math.round(Float.valueOf(pass)/n*100) + "%");
        System.out.println(Math.round(p2 * 100) + "%");
        scan.close();
    }
}
