import java.util.HashMap;
import java.util.Map;



public class GradeSystem{

    private  Map<String ,Integer> studentGrades= new HashMap<>();
 public  void addStudent (String name,int grade){
     studentGrades.put(name,grade);
     System.out.println("student add:"+ name+",grade"+grade);

 }
 public  void removeStudent(String name){
     if(studentGrades.containsKey(name)){
         int removeGrade=studentGrades.remove(name);
         System.out.println("student removed:" +name+ ",grade"+removeGrade);
     }else{
         System.out.println("student not found::"+name);

     }
 }
 public  void displayStudentGrade(String name){
 if(studentGrades.containsKey(name)){
     int grade=studentGrades.get(name);
     System.out.println("grade"+name+" "+grade);
 }else {
     System.out.println("student not found ::"+name);
 }

 }
 public void displayAllStudentGrades(){
     System.out.println("\n\nStudent Grades::");
     for(Map.Entry<String,Integer>entry: studentGrades.entrySet()){
         System.out.println(entry.getKey()+":"+ entry.getValue());
     }
 }

}
