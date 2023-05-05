import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        int n = 15;
        decimaltobinary(n);
    }

    public static void decimaltobinary(int n) {

        Stack<Integer> st = new Stack<Integer>();

        while (n > 0) {

            st.push(n % 2);
            n = n / 2;
        }
        int a[] = new int[st.size()];
        
        for (int i = 0; i < a.length; i++) {
        
            a[i] = st.pop();

        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

