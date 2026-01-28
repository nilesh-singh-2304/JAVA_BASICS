import java.util.*;

public class arrList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        //list-iterator
        Iterator<Integer> it = list.iterator();//from collection interface
        Iterator<Integer> it2 = list.listIterator();//same as above
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        list.add(20); // add element at end

        list.remove(0); // remove element at index
        list.remove(Integer.valueOf(10)); //remove value 10
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
