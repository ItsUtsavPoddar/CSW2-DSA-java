import java.util.HashMap;

public class ques9 {
    public static void main(String[] args) {

        int a[] = { 2, 5, 1, 6, 3, -1 };
        findsmallestmissing(a);
    }
    
    public static void findsmallestmissing(int a[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], 0);
        }

        for (int i = 1; i < a.length+1; i++) {
            if (hm.containsKey(i) == false) {
                System.out.println(i);
                break;
            }
        }
    }
}
