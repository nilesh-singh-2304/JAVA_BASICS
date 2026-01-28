import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
        Test<String> t = new Test<>("Hello");
        System.out.println(t.getId());
        Test<Integer> t1 = new Test<>(10);
        System.out.println(t1.getId());
        Test<Double> t2 = new Test<>(3.14);
        System.out.println(t2.getId());
        Test<Boolean> t3 = new Test<>(true);
        System.out.println(t3.getId());
        Test<Character> t4 = new Test<>('A');
        System.out.println(t4.getId());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        System.out.println(arr.get(0));
    }
}


class Test<T> {
    T id;

    public Test(T id){
        this.id = id;
    }

    T getId(){
        return id;
    }
}