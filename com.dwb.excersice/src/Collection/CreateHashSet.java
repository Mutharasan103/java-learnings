package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CreateHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        //LinkedHashSet<String>  hashSet1 = new LinkedHashSet<>();
        hashSet.add("Muthu");
        hashSet.add("Arasan");
        hashSet.add("Pearl");
        hashSet.add("King");
        hashSet.add("Mutharasan");
        hashSet.add("Muthu");
        System.out.println("The set is " +hashSet);



    }
}
