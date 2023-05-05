public class ques12 {
    public static void main(String[] args) {
        int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1};
        maxDist(a);
    }

    public static void maxDist(int a[]) {
        int max = -1;
        int start = 0;
        int end = 0;
        int maximal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] > a[i]) {
                    maximal = j - i;
                    if (maximal > max){
                        max = maximal;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println("j = " +end + "   i = " + start);
    }
}
