import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by afaren on 3/24/17.
 */
public class StudentTest {
    @Test
    public void first() throws Exception {
        final String firstStudentName = "Afaren Chen";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        final String secondStudentName = "Jeff Chen";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, student.getName());

    }
}