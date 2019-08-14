package lesson_1;

public class Example_11 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] arr = new int[3];
        arr[0] = nums[0] * 2;
        arr[1] = nums[1] * 2;
        arr[2] = nums[2] * 2;
        for (int i:arr){
            System.out.println(i);
        }
    }
}
