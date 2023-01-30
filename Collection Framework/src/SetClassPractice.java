import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassPractice {
    Set set = new HashSet();
    Set set1 = new HashSet();
    Set set2 = new TreeSet();

    public void getHashSetItems(){
        set.add("First");
        set.add("Second");
        set1.add("Third");
        set1.add("Fourth");
        set.addAll(set1);

        System.out.println(set);
    }
    public void getTreeSetItems(){
        set2.add("First");
        set2.add("Second");
        set2.add("Third");
        set2.add("Fourth");
        set2.addAll(set1);

        System.out.println(set2);
    }

}
