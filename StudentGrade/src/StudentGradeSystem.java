public class StudentGradeSystem {
    public static void main(String[] args) {
        GradeSystem gs= new GradeSystem();
        gs.addStudent("John=",85);
        gs.addStudent("Antony=",65);
        gs.addStudent("Ramallal=",95);

        //gs.displayStudentGrade("John");

        gs.removeStudent("Antony");

        gs.addStudent("DavidWIllay",30);
        gs.displayAllStudentGrades();

        gs.displayStudentGrade("Ramallal=");


    }
}
