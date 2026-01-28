public class objClass {
    public static void main(String[] args) {
        Cars obj1 = new Cars(2022,"Honda");
        Cars obj2 = new Cars(2022,"Honda");

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class Cars{
    int year;
    String model;

    public Cars(int year, String model){
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString(){
        // System.out.println("Car: " + year + ", " + model);
        return ("Car: " + year + ", " + model);
    }

    @Override
    public boolean equals(Object obj){
        Cars that = (Cars)obj;  //typecasting pf obj in cars
        if(this == that) return true;  //if both are same object
        return this.year == that.year && this.model.equals(that.model);
    }

    @Override
    public int hashCode(){
        int hashval = 37;
        hashval += year;
        hashval += model.hashCode();
        return hashval;
    }

}
