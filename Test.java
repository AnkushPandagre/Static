class Demo{
       int a, b, c;
       static int x,y,z;
       Demo(){
        System.out.println("constructor");
       }

       static void m1(){
        System.out.println("i am static method");
       }
       static{
        System.out.println("i am static block");
       }
       {
        System.out.println(" i am non static block");
       }
       void m2(){
        System.out.println(" i am non static methode");
       }
}


public class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.m2();
          d.m1();
    }
}
