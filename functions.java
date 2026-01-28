public class functions {
    public static void main(String[] args) {
        System.out.println("hello");

        greed();
        System.out.println(avg(10,20,true));
        System.out.println(avg(10,20,false));
        System.out.println("min of 10 and 20 is : " + Math.min(10, 20));
    }

    static void greed(){
        System.out.println("Greettttttt");
    }

    public static int avg(int a , int b , boolean should) {
        if(!should){
            return -1;
        }

        return (a+b)/2;
    }
}
