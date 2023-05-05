public class ques13 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 7, 10, 12};
        int b[] = { 1, 5, 7, 8  };
        maxsumpath(a, b);
    }

    public static void maxsumpath(int a[], int b[]) {
        
        int suma = 0, sumb = 0, result = 0, i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                suma = suma + a[i];
                i++;
            }

            else if (a[i] > b[j]) {
                sumb = sumb + b[j];
                j++;
            }

            
            else{
                

                result = result + a[i] + Math.max(suma, sumb);
            
                suma = sumb = 0;
                i++;
                j++;
            }
        }
        
        while (i < a.length) {
            suma = suma + a[i];
            i++;
            
        }

        while (j < b.length) {
            sumb = sumb + b[j];
            j++;
        }

        result = result + Math.max(suma, sumb);

        System.out.println(result);
    }
}
