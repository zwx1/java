package lesson_1;

import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入一个整数");
            int num = sc.nextInt();
            arr[x] = num;
        }
        int min = arr[0];
        int max = arr[0];
        for (int y = 1; y < arr.length; y++) {
            if (arr[y] < min) {
                min = arr[y];
            }
            for (int p = 1; p < arr.length; p++) {
                if (arr[p] > max) {
                    max = arr[p];

                }
            }

        }System.out.println("最低分为"+min);
        System.out.println("最高分为"+max);
        int d = 0;
        for (int w = 0; w < arr.length; w++){
            d += arr[w];
        }System.out.println("总分为为"+d);
        int arrange = (d - min-max) / (arr.length - 2);
        System.out.println("平均分为为"+arrange);

    }
}