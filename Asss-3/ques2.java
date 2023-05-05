import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        int arr[] =  { 0, 2,1,0,0,0,1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        zeroonetwo(arr);
    }
    
    public static void zeroonetwo(int arr[]) {
        
        int size = arr.length;

        int left = 0;
        int right = size - 1;

        while (left < right) {

            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1 || arr[right] == 2) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        
        right = size - 1;

        while (left < right) {

            while (arr[left] == 1) {
                left++;
            }
            while (arr[right] == 2) {
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
