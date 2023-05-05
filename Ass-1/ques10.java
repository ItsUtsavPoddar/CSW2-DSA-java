import java.util.Arrays;

public class ques10 {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        maxmin(a);
    }
    
    public static void maxmin(int a[]) {

        for (int i = 0; i < a.length; i++) {
            revarray(a, i, a.length - 1);
        }
        
        System.out.println(Arrays.toString(a));
    }
    
    public static void revarray(int a[], int start, int end) {
            for (int i = start; i < end; i++,end--) {
                swap(a, end, i);
            }
    }
    
    public static void swap(int a[], int b, int c) {
        
        int temp;
        temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
