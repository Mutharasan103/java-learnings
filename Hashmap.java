import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<>();
        hashmap.put(101,"Muthu");
        hashmap.put(102,"Arasan");
        hashmap.put(103,"Pearl");
        hashmap.put(104,"King");
        hashmap.put(105,"Mutharasan");
        hashmap.put(106,"Pearlking");
        hashmap.put(107,"Muthu");
        hashmap.put(108,"king");
        hashmap.put(109,"Hello");
        System.out.println(hashmap);

        // Copy value from one map to another
        Map<Integer,String> hashmap1 = new HashMap<>();
        hashmap1.putAll(hashmap);
        System.out.println(hashmap1);

        String val = hashmap.get(106);
        System.out.println(val);

        for (Map.Entry e: hashmap.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }




    }
}
