public class string {
    public static void main(String[] args) {
        String str1 = "Me";
        String str2 = "Me";
        String str3 = "me";
        String str4 = new String("Me");
        String str5 = new String("Me");
        String str6 = new String("me");

        if(str1 == str5){
            System.out.println("str1 == str5");  //will not be equal as both are in diff loc
        }else{
            System.out.println("str1 != str5");
        }

        if(str1 == str2){
            System.out.println("str1 == str2");  //will not be equal as both are in diff loc and == checks actual references
        }else{
            System.out.println("str1 != str2");
        }

        if (str1.equals(str5)) {
            System.out.println("str1 equals str5"); //equals
        } else {
            System.out.println("str1 not equals str5"); 
        }

        if (str4.equals(str5)) {
            System.out.println("str4 equals str5");  // will be equal
        } else {
            System.out.println("str4 not equals str5"); 
        }

        if (str4 == str5) {
            System.out.println("str4 equals str5");  
        } else {
            System.out.println("str4 not equals str5"); // not equal
        }

        if (str3.equalsIgnoreCase(str2)) {
            System.out.println("str3 equals str2");  // will be equal
        } else {
            System.out.println("str3 not equals str2"); // not equal
        }
    }
}
