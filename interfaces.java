public class interfaces {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eats();
        d.move();
    }
}

interface Mammal {
    void move();
}

interface Animal {
    void eats();
}

class Dog implements Animal,Mammal{
    public void eats(){
        System.out.println("dog eats");
    }

    public void move(){
        System.out.println("dog moves");
    }
}
