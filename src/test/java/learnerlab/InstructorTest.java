package learnerlab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {



    @Test
    void testImplementation() {
        Instructor instructor = new Instructor(1, "John");
        assertTrue(instructor instanceof Teacher);
    }


    @Test
    void testInheritance() {
        Instructor instructor = new Instructor(1, "John");
        assertTrue(instructor instanceof Person);
    }


    @Test
    void testTeach() {
        //given
        Instructor instructor = new Instructor(1, "John");
        Student student = new Student(2, "Jane");
        double numberOfHours = 10.0;

        //when
        instructor.teach(student, numberOfHours);

        //then
        assertEquals(numberOfHours, student.getTotalStudyTime());
    }

    @Test
    void testLecture() {
        //given
        Instructor instructor = new Instructor(1, "John");
        Student student1 = new Student(2, "Jane");
        Student student2 = new Student(3, "Jack");
        Student student3 = new Student(4, "Jill");

        Student[] students = {student1, student2, student3};

        double numberOfHours = 10.0;

        //when
        instructor.lecture(students, numberOfHours);

        //then
        double expectedStudyTime = numberOfHours / students.length;

        for (Student student : students) {
            assertEquals(expectedStudyTime, student.getTotalStudyTime());
        }
    }
}
