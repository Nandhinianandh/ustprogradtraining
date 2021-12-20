import java.util.*;
public class Main {

    public static void main(String[] args) {
	Map<Integer , String> map=new HashMap<>();
    map.put(100,"Nandhini");
    map.put(101 ,"Shalini");
    map.put(103,"santhi");
    map.put(104,"nandu");
    map.putIfAbsent(102,"Anandh");//add if not there else ignore already present
    //System.out.println(map.isEmpty());
    //System.out.println(map);
    System.out.println(map.get(101));
    map.remove(101);
    System.out.println(map);
   Set set=map.entrySet();
    Iterator itr=set.iterator();
    while (itr.hasNext()){
        Map.Entry<Integer,String> entry=(Map.Entry) itr.next();
        System.out.println(entry.getKey()+" -->"+entry.getValue());
    }
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" -->"+m.getValue());
        }

    }
}
