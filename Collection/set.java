import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet();//not sorted
        TreeSet<Integer> ts = new TreeSet();//sorted
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.addAll(List.of(2, 3, 4));
        hs.add(5);
        System.out.println("hashset");
        System.out.println(hs);
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.addAll(List.of(2, 3, 4));
        ts.add(5);
        System.out.println("treeset");
        System.out.println(ts);
    }
}
