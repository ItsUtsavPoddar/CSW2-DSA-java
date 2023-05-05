public class ques7 {
    public static void main(String[] args) {

        int a[] = { 10, 90, 49, 2, 1, 5, 23 };
        waveform(a);
    }
    
    public static void waveform(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {

            if (i % 2 == 0) {
                if (a[i + 1] > a[i]) {

                    swap(a, i, i+1);
                }
            }

            else {
                if (a[i + 1] < a[i]) {

                    swap(a, i, i+1);
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
    
   static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
