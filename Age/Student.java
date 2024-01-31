public class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException{
        if(age<15 || age >21){
            throw new AgeNotWithinRangeException("age should between 15 and 21");
        }
        if (!name.matches("^[a-zA-Z ]+$")){
            throw new NameNotValidException("name should be contain special symbols");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

    }
}
