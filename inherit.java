public class inherit {

    public static void main(String[] args) {
        // Your code here
        car c = new car();
        c.horn();
        System.out.println(c.number);
    }
}


class vehicle{
    int number;
    int milage;
    String color;

    vehicle(){
        System.out.println("vehicle constructor");
    }
    vehicle(int x){
        System.out.println("vehicle constructor with x = " + x);
    }
    void horn(){
        System.out.println("vehicle " + number + " blow the horn");
    }
}

class car extends vehicle{

    int n = number;

    car(){
        super(5);
        super.horn();
        System.out.println("supers number is " + super.number);
        System.out.println("car constructor");
    }
    void horn(){
        System.out.println("car " + number + " blow the horn");
    }
}