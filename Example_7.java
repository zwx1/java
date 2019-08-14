package lesson_1;

public class Example_7 {
    public static void main(String[] args) {
        int a = 8848;
        double b = 0.0001;
        int c = 0;
        while(b<a){
            c++;
            b = b*2;
        }
        System.out.println("需要折叠"+c+"次");
    }
}
