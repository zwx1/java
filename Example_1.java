package lesson_1;

public class Example_1 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<100;i++){
            if((i%2)!=0){
                 sum += i;
            }
        }
        System.out.println(sum);
    }
}
