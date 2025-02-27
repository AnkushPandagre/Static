 class Demo{
    static void m1(){
        System.out.println("i am static");
    }

    void m2(){
        System.out.println("i am not static");
    }
}



public class MathStatic {
    public static void main(String[] args) {
    // Demo d1 = new Demo();
    // d1.m2();
    // d1.m1();
    // Demo d2 = new Demo();
    // d2.m1();
    Demo.m1();

    }
}
