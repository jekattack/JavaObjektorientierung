package Students;

public class StudentDB{

    private Student[] students;

    StudentDB(String[][] newStudents){

        Student[] studentsArr = new Student[newStudents.length];
        for(int i = 0; i < newStudents.length; i++){
            Student newStudent = new Student(newStudents[i][0], newStudents[i][1], newStudents[i][2], newStudents[i][3]);
            studentsArr[i] = newStudent;
        }
        this.students = studentsArr;
    }

    public Student getStudent(int index){
        return this.students[index];
    }


}
