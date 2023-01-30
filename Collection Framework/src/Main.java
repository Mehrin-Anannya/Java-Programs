public class Main {

    public static void main(String[] args) {
        //List
        ListClassPractice listClassPractice = new ListClassPractice();
        listClassPractice.getListItems();
        listClassPractice.getArrayListItems();
        listClassPractice.getLinkedListItems();
        for(Teacher teacher2 : listClassPractice.getTeacherList()){
            System.out.println(teacher2.getTeacherId() + " " + teacher2.getTeacherName());
        }
        ;
/*

        //Set
        SetClassPractice setClassPractice = new SetClassPractice();
        setClassPractice.getHashSetItems();
        setClassPractice.getTreeSetItems();

        //LinkedHashSet
        LinkedHashSetPractice linkedHashSetPractice = new LinkedHashSetPractice();
        linkedHashSetPractice.getLinkedHashSet();
*/
        }
}
