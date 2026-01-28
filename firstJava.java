import java.util.Scanner;

public class firstJava { //this is a block is class ka naam hmesha file name he hoga
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(4+3);
        long nilesh = 1000000;
        int nil = (int)nilesh; 
        int age = 130;
        byte aage = (byte)age;
        System.out.println(aage);

        System.out.println(nil);


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();

        System.out.println(a+b);
        sc.close();
    }
}
