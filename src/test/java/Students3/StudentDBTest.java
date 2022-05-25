package Students3;

import Students3.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

class StudentDBTest {

    @Test
    void shouldCreate4StudentsAsObjectsOfStudents(){
        //Given
        // Student[] newStudents = new Student[4];
        ArrayList<Student> newStudentsList = new ArrayList<Student>();
        String generatedId1 = UUID.randomUUID().toString();
        String generatedId2 = UUID.randomUUID().toString();
        String generatedId3 = UUID.randomUUID().toString();
        String generatedId4 = UUID.randomUUID().toString();
        Student expected = new MathStudent(generatedId3,"Jack", "Meyers", "Washington", "Algebra");

        newStudentsList.add(new MathStudent(generatedId1, "Sören", "Olfason", "Kopenhagen", "Geometrics"));
        newStudentsList.add(new MathStudent(generatedId2, "Fabienne", "Crouteau", "Paris", "Statistics"));
        newStudentsList.add(expected);
        newStudentsList.add(new MathStudent(generatedId4, "Satoshi", "Yokohama", "Tokio", "Art"));

        //When
        StudentDB actual = new StudentDB(newStudentsList);

        //Then
        Assertions.assertEquals(expected,actual.getStudent(generatedId3));
    }

    @Test
    void shouldRemoveJack(){
        //Given
        ArrayList<Student> newStudentsList = new ArrayList<Student>();

        String generatedId1 = UUID.randomUUID().toString();
        String generatedId2 = UUID.randomUUID().toString();
        String generatedId3 = UUID.randomUUID().toString();
        String generatedId4 = UUID.randomUUID().toString();

        Student byeStudent = new MathStudent(generatedId3, "Jack", "Meyers", "Washington", "Algebra");

        newStudentsList.add(new MathStudent(generatedId1, "Sören", "Olfason", "Kopenhagen", "Geometrics"));
        newStudentsList.add(new MathStudent(generatedId2, "Fabienne", "Crouteau", "Paris", "Statistics"));
        newStudentsList.add(byeStudent);
        newStudentsList.add(new MathStudent(generatedId4, "Satoshi", "Yokohama", "Tokio", "Art"));

        StudentDB actual = new StudentDB(newStudentsList);

        //When
        int before = actual.getStudentList().size();
        actual.removeStudent(byeStudent);
        int after = actual.getStudentList().size();

        //Then
        Assertions.assertEquals(before, (after+1));
    }

}