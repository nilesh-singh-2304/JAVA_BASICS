public class custExce {
    public static void main(String[] args) {
        int age = 0;
        try {
            if (age < 18) {
                throw new customExce("Age is less than 18");
            }
            System.out.println("Age is valid");
        } catch (customExce e) {
            System.out.println(e);
        }
    }
}

class customExce extends Exception {
    public customExce(String message) {
        super(message);
    }
}
