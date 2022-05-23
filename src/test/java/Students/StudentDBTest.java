package Students;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StudentDBTest {

    @Test
    void shouldCreate4StudentsAsObjectsOfStudents(){
        //Given
        String[][] newStudents = {{"Sören", "Olfason", "Kopenhagen", "Design"}, {"Fabienne", "Crouteau", "Paris", "Fashion"}, {"Jack", "Meyers", "Washington", "Media"}, {"Satoshi", "Yokohama", "Tokio", "Food"}};

        //When
        String expected = "Satoshi";
        Student[] actual = StudentDB.createStudentArray(newStudents);

        //Then
        Assertions.assertEquals(expected,actual[3].getFirstname());
    }


    @Test
    void shouldCreate4StudentsAsObjectsOfStudents2(){
        //Given
        String[][] newStudents = {{"Sören", "Olfason", "Kopenhagen", "Design"}, {"Fabienne", "Crouteau", "Paris", "Fashion"}, {"Jack", "Meyers", "Washington", "Media"}, {"Satoshi", "Yokohama", "Tokio", "Food"}};

        //When
        String expected = "Fabienne";
        Student[] actual = StudentDB.createStudentArray(newStudents);

        //Then
        Assertions.assertEquals(expected,actual[1].getFirstname());
    }



}