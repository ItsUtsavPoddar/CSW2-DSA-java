import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println(al);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        al.add(n);

        System.out.println(al.contains(n));
        al.remove(0);
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}
