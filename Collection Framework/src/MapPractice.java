import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public void getHashMap(){
        Map map = new HashMap();
        map.put(1, "B");
        map.put(2, "A");
        System.out.println(map);
    }

    public void getLinkedHashMap(){

    }

    public void getTreeMap(){

    }

    public Map<Integer, Teacher> getTeacherMap(){
        Map<Integer, Teacher> teacherMap = new HashMap<>();
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        teacher.setTeacherId(1);
        teacher.setTeacherName("Mehrin");
        teacher1.setTeacherId(2);
        teacher1.setTeacherName("Anannya");

        teacherMap.put(1, teacher);
        teacherMap.put(2, teacher1);

        return teacherMap;
    }
}
