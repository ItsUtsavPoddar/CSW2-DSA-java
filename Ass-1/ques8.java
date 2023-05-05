import java.util.Arrays;

public class ques8 {
    public static void main(String[] args) {
        int a[] = { 8, -1, 6, 1, 9, 3, 2, 7, 4, -1 };
        sizeNndNelements(a);
    }

    public static void sizeNndNelements(int a[]) {

        for (int i = 0; i < a.length; i++) { // 0
            System.out.println("-----------------");
            while (a[i] != i && a[i] != -1) { 

                int temp = a[i];
                a[i] = a[temp]; 
                a[temp] = temp; 
                System.out.println(Arrays.toString(a));
            }
        }
        
        // System.out.println(Arrays.toString(a));

    }
}
