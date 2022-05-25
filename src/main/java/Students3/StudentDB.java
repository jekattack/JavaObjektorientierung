package Students3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class StudentDB{

    // private ArrayList<Student> students;

    private HashMap<String, Student> studentsMap = new HashMap<>();

    StudentDB(ArrayList<Student> newStudents){
        for(Student stud : newStudents){
            studentsMap.put(stud.getId(), stud);
        }
    }
    StudentDB(Student newStudent){
        studentsMap.put(newStudent.getId(), newStudent);
    }

    public Student getStudent(String id){
        return studentsMap.get(id);
    }
    public HashMap<String, Student> getStudentList(){
        return studentsMap;
    }
    public void addStudent(Student newStudent){
       if(studentsMap.get(newStudent.getId()) != null) throw new RuntimeException("Student existiert schon. :(");
       this.studentsMap.put(newStudent.getId(), newStudent);
    }
    public void removeStudent(Student byeStudent){
        studentsMap.remove(byeStudent.getId(), byeStudent);
    }


}
