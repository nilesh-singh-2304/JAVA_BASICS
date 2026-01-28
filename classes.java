public class classes {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.number = 1;
        c1.horn();

        constr cc1 = new constr();
        constr cc2 = new constr(10,20);
        cc1.print();
        cc2.print();
    }
}

class Car{
    int number;
    int milage;
    String color;

    void horn(){
        System.out.println("car " + number + " blow the horn");
    }

    void brk(){
        System.out.println("Stops the car");
    }
}

class bikes{
    int number;
    int milage;
    String color;

    void horn(){
        System.out.println("blow the horn");
    }

    void brk(){
        System.out.println("Stops the bike");
    }
}

class MO{
    void horn(int a){
        System.out.println("blow the horn");
    }

    // int horn(int a){
    //     System.out.println("blow the horn");
    //     return 0;
    // } not allowed as same no of parameters

    int horn(int a , int b){
        System.out.println("blow the horn");
        return 0;
    }
}


class constr{
    int a,b;

    constr(){
        this.a = 10;
        this.b = 20;
    }

    constr(int a , int b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println(a + " " + b);
    }
}
