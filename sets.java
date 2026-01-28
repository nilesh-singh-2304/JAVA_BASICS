import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("apple");
        s.add("banana");
        s.add("cherry");
        s.add("date");
        s.add(null);
        s.add(null); // duplicate element
        s.add("apple"); // duplicate element
        System.out.println(s);
        System.out.println(s);
    }
}
