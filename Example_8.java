package lesson_1;

public class Example_8 {
    public static void main(String[] args) {
        int i;
        int j = 1;
        for (i = 1; i < 101; i++) {
            if (i % 9 != 0 && i / 10 != 9 && i % 10 / 9 != 1) {

                if (j % 5 == 0) {
                    System.out.print(i + " ");
                    System.out.println();
                } else {
                    System.out.print(i + " ");
                }
                j++;
            }
        }

    }
}
