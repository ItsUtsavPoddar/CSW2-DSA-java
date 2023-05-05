import java.util.Stack;

public class ques3 {
    public static void main(String[] args) {
        int n = 1500;
        reverse(n);
    }

    public static void reverse(int n) {
        int m = 0;
        Stack<Integer> st = new Stack<>();

        while (n != 0) {
            m = m * 10 + (n % 10);
            st.push(m);
            n = n / 10;
        }


        System.out.println(st.pop());
    }
}

