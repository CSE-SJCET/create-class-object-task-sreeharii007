class Student{
     String name;
     int rollNumber;
     String grade;
     void displayStudent(){
          name="thankappan";
          rollNumber=56;
          grade="D";
          System.out.println("Name :"+name);
          System.out.println("Rollno :"+rollNumber);
          System.out.println("Grade :"+grade);
     }
     }
// TODO: Create a class called Student with name, rollNumber, and grade

    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
           Student student=new Student();
           student.displayStudent();
        // TODO: Create a Student object and call the method to display details
    }
}
