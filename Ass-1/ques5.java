public class ques5 {
    public static void main(String[] args) {
        int a[] = { 1,2,3,4,5};
        int k = 8;
        rotationR(a, k);
    }
    
    public static void rotationR(int a[], int k) {
        
        int b[] = new int[a.length];

        k = k % a.length;

        for (int i = 0; i < b.length; i++) {

            if (i < k) {
                b[i] = a[a.length - k + i];
            }

            else {
                b[i] = a[-k + i];
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] +" ");
        }
    }
}
