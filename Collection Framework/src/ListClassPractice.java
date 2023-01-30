import java.util.*;

public class ListClassPractice {

    public void getListItems() {
        List list = new ArrayList();
        list.add("List");
        list.add(1, "Normal List");
        list.add(1,"Item");
        System.out.println(list);
        System.out.println("-----List with Iterator-------");
        getIteration(list);
        System.out.println("-----List with For Each-------");
        getForEach(list);
    }
    public void getArrayListItems() {
        ArrayList list = new ArrayList();
        list.add("Array");
        list.add("List");
        list.add(1, "Arraylist");
        list.add(1,"Item");
        System.out.println("-----ArrayList with Iterator-------");
        getIteration(list);
        System.out.println("-----ArrayList with For Each-------");
        getForEach(list);
    }

    public void getLinkedListItems() {
        LinkedList list = new LinkedList();
        list.add("Linked");
        list.add("List");
        list.add(1, "LinkedList");
        list.add(1,"Item");

        System.out.println("-----LinkedList with Iterator-------");
        getIteration(list);
        System.out.println("-----LinkedList with For Each-------");
        getForEach(list);
    }

    public void getIteration(List list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String s = (String)iterator.next();
            System.out.println(s);
        }
    }

    public void getForEach(List list){
        for(Object list1:list){
            System.out.println(list1);
        }
    }

    public List<Teacher> getTeacherList(){
        Teacher teacher= new Teacher();
        Teacher teacher1 = new Teacher();
        List<Teacher> teacherList = new ArrayList<>();
        teacher.setTeacherId(1);
        teacher.setTeacherName("Mehrin");
        teacher1.setTeacherId(2);
        teacher1.setTeacherName("Anannya");

        teacherList.add(teacher);
        teacherList.add(teacher1);
        return teacherList;
    }
}