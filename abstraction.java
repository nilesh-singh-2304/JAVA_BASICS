public class abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.horn();
        System.out.println(c.number);
    }
}

abstract class vehicle{
        int number;
        int milage;
        String color;

        vehicle(){
            System.out.println("vehicle constructor");
        }

        abstract void horn();
    }

    class Car extends vehicle{
        int n = number;
        void horn(){
            System.out.println("car " + number + " blow the horn");
        }
    }
