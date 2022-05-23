import SchoolPackage.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateClassTest {

    @Test
    void shouldReturnJensWhenCreateStudentWithAttrJens(){
        //Given
        Student student1 = new Student("Jens", 8, "Bad Orb");

        //When
        String result = student1.getName();

        //Then
        Assertions.assertEquals("Jens", result);

    }

    @Test
    void shouldReturnJensAsString(){
        //Given
        Student student1 = new Student("Jens", 8, "Bad Orb");

        //When
        String actual = student1.toString();
        String expected = "Jens, 8, Bad Orb";

        //Then
        Assertions.assertEquals(expected, actual);

    }

}