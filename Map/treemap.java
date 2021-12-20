import java.util.*;
public class treemap {//maintains insertion order

    public static void main(String[] args) {
        //comparator
        TreeMap<Integer , String> map=new TreeMap<>();
       // TreeMap<Integer , String> map=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put(100,"Nandhini");
        map.put(101 ,"Shalini");
        map.put(104,"nandu");
        map.put(103,"santhi");
        map.putIfAbsent(102,"Anandh");//add if not there else ignore already present
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" -->"+m.getValue());
        }
        System.out.println("headmap:"+map.headMap(101));
        System.out.println("tailmap:"+map.tailMap(103));
        System.out.println("submap:"+map.subMap(100,103));


    }
}

