package lesson_1;

import java.util.Random;

public class Example_14 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Boolean[] b = {false, false, false};

        Random random = new Random();
        int i = 0;
        while (i < 3) {
           int c = random.nextInt(3);
            if (!b[c]) {
                System.out.println(a[c]);
                b[c] = true;
                i++;
            }
        }

    }}