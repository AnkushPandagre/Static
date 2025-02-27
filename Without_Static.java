class Student{
    String name;
    String institute;

    void getDetails(){
        System.out.println(" name " + name);
        System.out.println(" institute " + institute);
    }

}
class Register{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ankush";
        s1.institute = "pentagon space";
        Student s2 = new Student();
        s2.name = "Tejas";
        s2.institute = "pentagon space";
        s1.getDetails();
        s2.getDetails();

    }

}