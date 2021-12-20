import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList(20);
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        ArrayList<String> list=new ArrayList<String>();
        list.add("nandhu");
        list.add("shalu");
        list.add("santhi");
        for(int i=0;i<arraylist.size();i++) {
            //System.out.println(arraylist.get(i));

            System.out.println("Student id  name");
            System.out.print(arraylist.get(i));
            System.out.println("\t");
            System.out.print(list.get(i));

            System.out.println("\n");
        }
        arraylist.remove(2);
        System.out.println("After deleting dicontinue student");
        for (Iterator<Integer> it = arraylist.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }






    }
}
