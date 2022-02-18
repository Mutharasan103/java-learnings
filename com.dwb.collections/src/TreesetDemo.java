import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        //Tree set
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(100);
        treeSet.add(80);
        treeSet.add(120);
        treeSet.add(50);
        treeSet.add(100);
        treeSet.add(70);
        treeSet.add(150);
        treeSet.add(175);
        treeSet.add(10);
        System.out.println(treeSet);

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1 = (TreeSet)treeSet.headSet(50);

        Iterator iterator;
        iterator = treeSet1.iterator();
        System.out.println("Tree  set data: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()+ " ");
        }



    }
}
