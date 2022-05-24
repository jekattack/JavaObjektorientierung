package Students2;

public class StudentDB{

    private Student[] students;

    StudentDB(Student[] newStudents){
        this.students = newStudents;
    }

    public Student getStudent(int index){
        return this.students[index];
    }


}
