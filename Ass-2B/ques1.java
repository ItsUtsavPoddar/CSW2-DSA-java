import java.util.TreeSet;

public class ques1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(5);
        tree.add(6);
        System.out.println(tree);
        System.out.println(tree.contains(6));
        tree.remove(6);
        System.out.println(tree);

    }
}
