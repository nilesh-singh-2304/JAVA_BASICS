public class nestedClass {

    class Toy{                           //psvm can have access to this class , but cant be instantiated in psvm as non-static cant be instantiated in static
        public void play(){
            System.out.println("toy is playing");
        }
    }

    static class Toys{
        public void play(){
            System.out.println("toy is playing");
        }
    }
    public static void main(String[] args) {
        // Toy toy = new Toy(); // non-static cant be instantiated in static
        Toys toy1 = new Toys(); // static can be instantiated in static
        toy1.play();

        //for instantiating non static we first need to create object o the nonstatic class
        Toy t1 = new nestedClass(). new Toy();
        t1.play();
    }
}

class outer {

    class toy{
        public void play(){
            System.out.println("toy is playing");
        }
    }
}
