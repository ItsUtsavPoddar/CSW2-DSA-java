import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> ll = new LinkedList<>();
        System.out.println(ll);
        
        ll.add( new Student("a",13) );
        ll.add( new Student("b",132) );
        ll.add(new Student("c", 1322));
        System.out.println(ll);
        
        System.out.println("enter name");
        String name = sc.nextLine();

        for (Student s : ll) {
            if (s.name.equals(name)) {
                System.out.println(" present: " + name + " age: " + s.age);
            }
        }
        
        ll.remove(2);
        System.out.println(ll.size());
     

    }
}

 class Student {
    
     String name;
     int age;

     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     
}