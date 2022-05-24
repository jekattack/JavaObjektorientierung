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
        StudentDB actual = new StudentDB(newStudents);

        //Then
        Assertions.assertEquals(expected,actual.getStudent(3).getFirstname());
    }


    @Test
    void shouldCreate4StudentsAsObjectsOfStudents2(){
        //Given
        String[][] newStudents = {{"Sören", "Olfason", "Kopenhagen", "Design"}, {"Fabienne", "Crouteau", "Paris", "Fashion"}, {"Jack", "Meyers", "Washington", "Media"}, {"Satoshi", "Yokohama", "Tokio", "Food"}};

        //When
        String expected = "Fabienne";
        StudentDB actual = new StudentDB(newStudents);

        //Then
        Assertions.assertEquals(expected,actual.getStudent(1).getFirstname());
    }



}