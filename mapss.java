import java.util.*;

public class mapss {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        mp.put("key1","value1");
        mp.put("key2","value2");
        mp.put("key3","value3");
        // System.out.println(mp);
        // System.out.println(mp.get("key1"));
        // mp.remove("key2");
        // System.out.println(mp);

        class Student {
            String Name;
            Integer id;

            Student(String name , Integer id){
                this.Name = name;
                this.id = id;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "Name='" + Name + '\'' +
                        ", id=" + id +
                        '}';
            }
        }

        Student s1 = new Student("John",101);
        Student s2 = new Student("Jane",102);

        Map<Integer , ArrayList<Student>> mp1 = new HashMap<>();
        mp1.put(1,new ArrayList<Student>());
        mp1.put(2,new ArrayList<Student>());
        mp1.get(1).add(s1);
        mp1.get(1).add(s2);
        //dynamically add student
        mp1.get(1).add(new Student("Rajiv",103));
        mp1.get(2).add(new Student("Rajiv",103));
        // mp1.get(2).add("value3");

        //Entryset iteration
        for(Map.Entry<Integer , ArrayList<Student>> entry : mp1.entrySet()){
            System.out.println(entry.getKey() + " values for this are " + entry.getValue());
            // System.out.println();
        }



        // System.out.println(mp1);
        // System.out.println(mp1.get(1));
        // mp1.remove(2);
        // System.out.println(mp1);
    }
}
