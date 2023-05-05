import java.util.Arrays;

public class ques3 {
    public static void main(String[] args) {
        int a[] = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //range(a, 14, 20);
            
    }
    
    public static void range(int a[], int low, int high) {

        int size = a.length;
        int start = 0;
        int end = size - 1;
        int i = 0;
        
        while (i <= end) {

            if (a[i] < low) {
                swap(a, start, i);
                i++;
                start++;
            }

            else if (a[i] > high) {
                swap(a, end, i);
                end--;
            }

            else {
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+" ");
        }
    }

    
    public static void swap(int a[], int start, int i) {
        
        int temp = a[start];
        a[start] = a[i];
        a[i] = temp;
    }
    
}
