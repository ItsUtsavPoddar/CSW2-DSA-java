public class ques4 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7, 9, 11, 15, 19 };
        int index = binarysearch(a, 3, a.length-1,0);
        System.out.println(index);
    }

    public static int binarysearch(int a[],int n,int ul,int ll) {
        
        int mid = (ul+ll)/2;
        if (ul >= ll) {

            if (a[mid] == n) {
                return mid;
            }

            if (n > a[mid]) {
                return binarysearch(a, n, ul, mid + 1);
            }

            if (n < a[mid]) {
                return binarysearch(a, n, mid - 1, ll);
            }
        }
        
        return -1;
        
    }
}
