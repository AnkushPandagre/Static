public class Studen{
    String name;
   static String institute ;

    void getDetails(){
        System.out.println("name : " + name );
        System.out.println("institute : " +  institute );
    }
}
class WithStatic{
    public static void main(String[] args) {
        Studen s1 = new Studen();
        s1.name = " Ankush";
        s1.institute = "pentagon spacae";
        Studen s2 = new Studen();
        s2.name = "tejas";
        s1.getDetails();
        s2.getDetails();
        Studen .institute = "xyz";
        s1.getDetails();
        s2.getDetails();

    }
}
