import java.util.Stack;

public class ques4 {
    public static void main(String[] args) {

        String s = "231*+9-";
        postfix(s);
    }

    public static void postfix(String s) {
        
        int a = 0;
        int b = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                st.push(s.charAt(i) - '0');
            }

            else {

                if (s.charAt(i) == '+') {
                    a = st.pop();
                    b = st.pop();

                    st.push(b + a);
                }
                if (s.charAt(i) == '-') {
                    a = st.pop();
                    b = st.pop();

                    st.push(b - a);
                }
                if (s.charAt(i) == '/') {
                    a = st.pop();
                    b = st.pop();

                    st.push(b / a);
                }
                if (s.charAt(i) == '*') {
                    a = st.pop();
                    b = st.pop();

                    st.push(b * a);
                }
            }
        }
        
        System.out.println(st.pop());
    }
}

