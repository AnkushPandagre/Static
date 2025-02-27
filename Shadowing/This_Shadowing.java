class Student1{
    private String name;
    private int marks;
    private float height;

    void setData(String n,int m, float h){
        name = n;
        marks = m;
        height = h;
    }
    String getName() {
      return name;
  }

  int getMarks() {
      return marks;
  }

  float getHeight() {
      return height;
  }


} 
class Student2{
    private String name;
    private int marks;
    private float height;

    void setData(String name,int marks, float height){
        name = name;
        marks = marks;
        height = height;
    }
    String getName() {
      return name;
  }

  int getMarks() {
      return marks;
  }

  float getHeight() {
      return height;
  }

} 
class Student3{
    private String name;
    private int marks;
    private float height;

    void setData(String name,int marks, float height){
     this.name = name;
     this.marks = marks;
       this.height = height;
    }
    String getName() {
      return name;
  }

  int getMarks() {
      return marks;
  }

  float getHeight() {
      return height;
  }

} 
class Demo{
  public static void main(String[] args) {
    Student1 s1 = new Student1();
    s1.setData("Ankush", 80 , 5.5f);
    Student2 s2= new Student2();
    s2.setData("Arjun", 75 , 6.5f);
    Student3 s3 = new Student3();
    s3.setData("Ram", 90 , 5.7f);
   
    System.out.println("Student 1: " + s1.getName() + ", Marks: " + s1.getMarks() + ", Height: " + s1.getHeight());
    System.out.println("Student 2: " + s2.getName() + ", Marks: " + s2.getMarks() + ", Height: " + s2.getHeight());
    System.out.println("Student 3: " + s3.getName() + ", Marks: " + s3.getMarks() + ", Height: " + s3.getHeight());
  }
      
 }


