public class anonymous {

    // class Inner extends outer{    // normal method to extend

    // }

    Outer outobj = new Outer() {    // anonymous class or anonymous extension of class Outer
        public void method(){
            System.out.println("inner method");  // can be used only once in the outerobj and then it'll be destroyed
        }
    };

    OuterInterf outerinterfObj = new OuterInterf() {    // anonymous class or anonymous extension of interface OuterInterf
        public void method(){
            System.out.println("inner method");  // can be used only once in the outerinterfObj and then it'll be destroyed
        }
    };

    //upr waala poora replace ho skta h albmda expressions se , iff hmara interface functional interface ho
    OuterInterf outerinterfObj2 = () -> {    // lambda expression , it is implementation of void method in the prev obj
        System.out.println("inner method");  // can be used only once in the outerinterfObj and then it'll be destroyed
    };
    public static void main(String[] args) {
        OuterInterf outerinterfObj3 = () -> {    // lambda expression , it is implementation of void method in the prev obj
            System.out.println("inner method");  // can be used only once in the outerinterfObj and then it'll be destroyed
        };
        outerinterfObj3.method();
    }
}

class Outer{
    public void method(){
        System.out.println("outer method");
    }
}

interface OuterInterf {

    public void method();
}
