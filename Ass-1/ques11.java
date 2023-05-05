import java.util.Arrays;

public class ques11 {
    public static void main(String[] args) {

        int a[] = { 8, 13, 1, 2 };
        rotSum(a);
    }
    
    public static void rotSum(int a[]) {
        int k = a.length;
        int max = 0;
        int c[] = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            int b[] = new int[a.length];
            k--;
            for (int j = 0; j < a.length; j++) {

                if (j< k) {
                    b[j] = a[a.length - k + j];
                }

                else {
                    b[j] = a[-k + j];
                }
            }
            int maximal = 0;

            for (int j = 0; j < b.length; j++) {
                maximal = maximal + (b[j] * (j+1));
            }
            if (maximal > max) {
                max = maximal;
                for (int j = 0; j < b.length; j++) {
                    c[j] = b[j];
                }
            }

        }

        System.out.println(Arrays.toString(c));
        System.out.println(max);
    }
}
