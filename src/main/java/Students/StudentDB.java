package Students;

public class StudentDB{
    public static Student[] createStudentArray(String[][] newStudents){
        Student[] students = new Student[newStudents.length];
        for(int i = 0; i < newStudents.length; i++){
            Student newStudent = new Student(newStudents[i][0], newStudents[i][1], newStudents[i][2], newStudents[i][3]);
            students[i] = newStudent;
        }
        return students;
    }
}
