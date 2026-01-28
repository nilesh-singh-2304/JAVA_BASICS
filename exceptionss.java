public class exceptionss {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        try {
            int x = a[2]/0;
            System.out.println(a[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }

         try {
            int x = a[2]/0;
            System.out.println(a[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } finally{
            System.out.println("Finally block executed");
        }

        System.out.println("Hello");
    }
}
