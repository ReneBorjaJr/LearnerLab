package learnerlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testImplementation() {
        // given
        Student student = new Student(1, "John");

        // then
        assertTrue(student instanceof Learner);
    }

    @Test
    void testInheritance() {
        // given
        Student student = new Student(1, "John");

        // then
        assertTrue(student instanceof Person);
    }

    @Test
    void testLearn() {
        // given
        Student student = new Student(1, "John");
        double numberOfHours = 10.0;

        // when
        student.learn(numberOfHours);

        // then
        assertEquals(numberOfHours, student.getTotalStudyTime());
    }

    @Test
    void testLearnZeroNumberOfHours() {
        //given
        Student student = new Student(1, "John");
        double numberOfHours = 0.0;
        //when
        student.learn(numberOfHours);
        //then
        assertEquals(0.0, student.getTotalStudyTime());
    }

    @Test
    void testLearnNegativeNumberOfHours() {
        //given
        Student student = new Student(1, "John");
        double numberOfHours = -5.0;
        //when
        student.learn(numberOfHours);

        //then
        assertEquals(0.0, student.getTotalStudyTime());
    }

    @Test
    void testGetTotalStudyTimeInvalidInput() {
        //given
        Student student = new Student(1, "John");
        student.learn(-5);

        //when
        double totalStudyTime = student.getTotalStudyTime();

        //then
        assertEquals(0.0, totalStudyTime);
    }

}