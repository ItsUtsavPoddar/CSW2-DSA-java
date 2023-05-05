public class ques14 {
    public static void main(String[] args) {
        int num=3;
            tower(num, 'A', 'C', 'B');
    }

    public static void tower(int num, char fromrod, char torod, char auxrod) {
        
        if (num < 1) {
            return;
        }
        
        tower(num - 1, fromrod, auxrod, torod);
        System.out.println();
        tower(num - 1, auxrod, torod, fromrod);
    }
}
