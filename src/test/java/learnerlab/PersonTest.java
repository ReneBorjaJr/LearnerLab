package learnerlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void testConstructor() {
        //given
        Person person = new Person(1, "John");
        assertEquals(1, person.getId());
        assertEquals("John", person.getName());
    }


    @Test
    void testSetName() {
        //given
        Person person = new Person(1, "John");

        //when
        person.setName("Jane");

        //then
        assertEquals("Jane", person.getName());
    }

}