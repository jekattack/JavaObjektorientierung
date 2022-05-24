package Students3;

import Students3.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

¥
class StudentDBTest {

    @Test
    void shouldCreate4StudentsAsObjectsOfStudents(){
        //Given
        Student[] newStudents = new Student[4];

        newStudents[0] = new MathStudent("Sören", "Olfason", "Kopenhagen", "Geometrics");
        newStudents[1] = new MathStudent("Fabienne", "Crouteau", "Paris", "Statistics");
        newStudents[2] = new MathStudent("Jack", "Meyers", "Washington", "Algebra");
        Student expected = new ArtStudent("Satoshi", "Yokohama", "Tokio", "Art");
        newStudents[3] = expected;
        //When
        StudentDB actual = new StudentDB(newStudents);

        //Then
        Assertions.assertEquals(expected,actual.getStudent(3));
    }


    @Test
    void shouldCreate4StudentsAsObjectsOfStudents2() {
        //Given
        Student[] newStudents = new Student[4];

        newStudents[0] = new MathStudent("Sören", "Olfason", "Kopenhagen", "Geometrics");
        Student expected = new ArtStudent("Fabienne", "Crouteau", "Paris", "Statistics");
        newStudents[1] = expected;
        //When
        StudentDB actual = new StudentDB(newStudents);

        //Then
        Assertions.assertEquals(expected, actual.getStudent(1));
    }
}