import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        zeroone(arr);
    }
    
    public static void zeroone(int arr[]) {
        
        int size = arr.length;

        int left = 0;
        int right = size - 1;

        while (left < right) {

            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
