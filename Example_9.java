package lesson_1;

public class Example_9 {
    public static void main(String[] args) {
        int[] is = {13,45,65,33};
        int min = is[0];
        //is[0] = 3;
//        for (int i:is){
//            System.out.println(i);
//        }
        for(int x =1;x<is.length;x++){
            if (is[x]<min){
                min = is[x];
            }
        }
            System.out.println(min);

    }
}
