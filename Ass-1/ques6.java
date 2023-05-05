public class ques6 {
    public static void main(String[] args) {
        int a[] = { -5, 4, 6, -3, 4, 1 };
        findmaxarray(a);
    }

    public static void findmaxarray(int a[]) {
        
        int max = Integer.MIN_VALUE;
        int maximal = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            maximal = maximal + a[i];

            if (maximal > max) {
                max = maximal;
                start = s;
                end = i;
            }

            if (maximal < 0) {
                maximal = 0;
                s = i+1;
            }
        }
        System.out.println(max);

        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
