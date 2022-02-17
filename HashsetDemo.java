import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashsetDemo {
    public static void main(String[] args) {
        // Hashset
        // Don't follow an order in hashset
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("Six");
        hashSet.add("Seven");
        hashSet.add("Eight");
        hashSet.add("Nine");
        hashSet.add("Ten");
        System.out.println("The linked list is- "+hashSet);
        Set<String> treeset = new TreeSet<>(hashSet);
        System.out.println("Tree set elements are: ");
        for (String str1:treeset)
        {

            System.out.println(str1);
        }

        Iterator it = hashSet.iterator();
        //for (String str : hashSet)
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        // convert to string
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        System.out.println("Array elements are: ");
        for (String str:array)
        {
            System.out.println(str);
        }
    }
}
