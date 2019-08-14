package lesson_1;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        int num = 0;
       for(int i=0;i<2;i++){
        for(int x=100;x<1000;x++){
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/10/10;
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x){
                num += 1;
                System.out.print(x+" ");
                if( num % 2==0){
                    System.out.println();
                }
            }


    }
}}}
