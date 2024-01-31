import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {

        try{
           Student st1=new Student(101,"ravi kiran",18,"Computer Science");

            System.out.println("Enter valid student information::");
            System.out.println("RollNO::"+st1.getRollNo());
            System.out.println("Name::"+st1.getName());
            System.out.println("Age::"+st1.getAge());
            System.out.println("Course::"+st1.getCourse());

            Student st2=new Student(102,"Arabor@1234",16,"Maths");
            System.out.println("This will not printed due to NameNotValidException::");

            Student st3= new Student(103,"kiran",23,"Physics");
            System.out.println("This will not printed due to AgeNotWithinRangeException::");

        }catch (AgeNotWithinRangeException e){
            System.out.println("Error::"+e.getMessage());

        }catch (NameNotValidException e){
            System.out.println("Error::"+ e.getMessage());
        }
        /*Scanner sc=new Scanner(System.in);

        try{
            System.out.println("enter student information::");
            System.out.print("ROll No::");
            int rollNo= sc.nextInt();
            sc.nextLine();
            System.out.print("Name::");
            String name=sc.nextLine();
            System.out.print("Age:");
            int age=sc.nextInt();
            System.out.print("Course::");
            String course=sc.nextLine();

            Student student=new Student(rollNo, name, age, course);

            System.out.println("Student Information::");
            System.out.println("Roll No" + student.getRollNo());
            System.out.println("Name" + student.getName());
            System.out.println("Age"+ student.getAge());
            System.out.println("Course" + student.getCourse());



        }catch (AgeNotWithinRangeException e){
            System.out.println("Error ::"+ e.getMessage());
        }catch (NameNotValidException e){
            System.out.println("Error ::" + e.getMessage());
        }
        sc.close();
    }*/
    }

}
