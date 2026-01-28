import java.util.ArrayList;
import java.util.*;

public class comparatorAndComparable {
    public static void main(String[] args) {
        Animalsss a1 = new Animalsss("dog" , 5 , 10);
        Animalsss a2 = new Animalsss("cat" , 3 , 8);
        Animalsss a3 = new Animalsss("bird" , 2 , 5);
        Animalsss a4 = new Animalsss("fish" , 1 , 3);

        List<Animalsss> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        System.out.println(animals);

        // animals.sort();
        Collections.sort(animals);
        System.out.println(animals);
    }
}

class Animalsss implements Comparable<Animalsss> {
    String name;
    int age;
    int weight;

    Animalsss(String name , int age , int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String toString(){
        return "Animalsss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + "\n";
    }

    public int compareTo(Animalsss o){
        if(this.name.equals(o.name)) {
            return this.name.compareTo(o.name); //ascending
        }
        return this.age - o.age; //ascending
    }
}
