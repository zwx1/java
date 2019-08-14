package lesson_1;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数");
        int number = sc.nextInt();
        int sum = 0;
        for(int x=100;x<number;x++){
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/10/10;
            if(ge!=7 && shi!=5 && bai!=3){
                sum += x;

            }

        }
        System.out.println(sum);
    }

}
