import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    public void getLinkedHashSet(){
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Linked");
        linkedHashSet.add("Hash");
        linkedHashSet.add("Set");
        linkedHashSet.add("Set");
        System.out.println("---- LinkedHashSet with Iteration----");
        getLinkedHashSetIteration(linkedHashSet);
        System.out.println("---- LinkedHashSet with For Each----");
        getLinkedHashSetForEach(linkedHashSet);
    }

    public void getLinkedHashSetIteration(LinkedHashSet linkedHashSet){
        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
    }

    public void getLinkedHashSetForEach(LinkedHashSet linkedHashSet){
        for(Object list1:linkedHashSet){
            System.out.println(list1);
        }
    }
}
