package lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int[] arr = new int[num];
        Random r = new Random();
        for(int i=0 ;i<=5;i++){
            int num2 = r.nextInt(100);
            arr[i] = num2;
            if (arr[i] >5 && arr[i] % 2==0){
                System.out.println(arr[i]);
        }

            }

        }
    }

