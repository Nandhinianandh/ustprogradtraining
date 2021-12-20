import java.util.*;
public class linkedhashmap {//maintains insertion order

    public static void main(String[] args) {
        LinkedHashMap<Integer , String> map=new LinkedHashMap<>();
        map.put(100,"Nandhini");
        map.put(101 ,"Shalini");
        map.put(103,"santhi");
        map.put(104,"nandu");
        map.putIfAbsent(102,"Anandh");//add if not there else ignore already present
        map.remove(101);

        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+" -->"+m.getValue());
        }

    }
}

