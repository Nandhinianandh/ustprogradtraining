import java.util.Vector;
//supports multithreading
public class vector{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(8);
        vector.add("apple");
        vector.add("banana");
        vector.add("pomegranate");
        vector.add("orange");
        vector.addElement("grapes");//part of vector alone (unique)
        System.out.println(vector);
        //System.out.println(vector.capacity());
        //System.out.println(vector.size());
        System.out.println(vector.firstElement());
        System.out.println(vector.contains("kiwi"));
        System.out.println(vector);
        vector.removeElement("orange");
        vector.forEach(fruits -> System.out.println(fruits));

    }
}
