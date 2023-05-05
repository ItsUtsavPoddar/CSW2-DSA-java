import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        TreeMap<String, Address> map = new TreeMap<String, Address>();
        map.put("A", new Address(1, "Park", "Nahi Karna Chaiyea"));
        map.put("B", new Address(2, "Dark", "PosterBoy"));
        map.put("C", new Address(3, "Mark", "Lol"));

        for (String key : map.keySet()) {

            Address ad = map.get(key);
            System.out.println(key + " " + ad.plotnumber);
        }

    }
}

class Address{
    int plotnumber;
    String at;
    String post;

    public Address(int plotnumber, String at, String post) {
        this.plotnumber = plotnumber;
        this.at = at;
        this.post = post;
    }

}
