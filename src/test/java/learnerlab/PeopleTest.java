package learnerlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void testAdd() {
        //given
        People people = new People();
        Person person = new Person(1, "John");

        //when
        people.add(person);

        //then
        assertTrue(people.contains(person));
    }

    @Test
    void testAddNull() {
        //given
        People people = new People();

        //when
        people.add(null);

        //then
        assertTrue(people.contains(null));
    }



    @Test
    void testRemove() {
        //given
        People people = new People();
        Person person = new Person(1, "John");

        //when
        people.add(person);
        people.remove(person);

        //then
        assertFalse(people.contains(person));
    }

    @Test
    void testRemoveNull() {
        //given
        People people = new People();

        //when
        people.remove(null);

        //then
        assertEquals(0, people.count());
    }

    @Test
    void testRemoveNotFound() {
        //given
        People people = new People();
        Person person = new Person(1, "John");
        people.add(person);

        //when
        people.remove(new Person(2, "Jane"));

        //then
        assertTrue(people.contains(person));
    }

    @Test
    void testRemoveByIdEmpty() {
        //given
        People people = new People();
        //when
        people.removeById(1);
        //then
        assertEquals(0, people.count());
    }

    @Test
    void removeByIdNotFound() {
        //given
        People people = new People();
        people.add(new Person(1, "John"));

        //when
        people.removeById(2);

        //then
        assertEquals(1, people.count());
    }

    @Test
    void RemoveById() {
        //given
        People people = new People();
        Person person = new Person(1, "John");
//        Person person2 = new Person(2, "Jane");
        people.add(person);
//        people.add(person2);
        //when
        people.removeById(1);
        //then
        assertEquals(0, people.count());
    }



    @Test
    void testFindById() {
        //given
        People people = new People();
        Person person = new Person(1, "John");

        //when
        people.add(person);

        //then
        assertTrue(people.findById(1));
    }

    @Test
    void testFindByIdNotFound() {
        //given
        People people = new People();
        Person person = new Person(1, "John");


        //when
        people.add(person);
        boolean result = people.findById(2);

        //then
        assertFalse(result);
    }

    @Test
    void testFindByIdEmpty() {
        //given
        People people = new People();
        //when
        boolean result = people.findById(1);
        //then
        assertFalse(result);
    }

    @Test
    void removeAllTest() {
        //given
        People people = new People();
        Person person = new Person(1, "John");
        Person person2 = new Person(2, "Jane");
        people.add(person);
        people.add(person2);
        //when
        people.removeAll();
        //then
        assertEquals(0, people.count());
    }

    @Test
    void removeAllEmptyTest() {
        //given
        People people = new People();
        //when
        people.removeAll();
        //then
        assertEquals(0, people.count());
    }

    @Test
    void testCount() {
        //given
        People people = new People();
        people.add(new Person(1, "John"));
        people.add(new Person(2, "Jane"));
        //when
        int count = people.count();
        //then
        assertEquals(2, count);
    }

    @Test
    void testCountNull() {
        //given
        People people = new People();
        people.add(null);
        //when
        int count = people.count();
        //then
        assertEquals(0, count);
    }

    @Test
    void testCountEmpty() {
        //given
        People people = new People();
        //when
        int count = people.count();
        //then
        assertEquals(0, count);
    }

    @Test
    void toArrayTestEmpty() {
        //given
        People people = new People();
        //when
        Person[] array = people.toArray();
        //then
        assertEquals(0, array.length);
    }

    @Test
    void toArrayTest() {
        //given
        People people = new People();
        people.add(new Person(1, "John"));
        people.add(new Person(2, "Jane"));
        //when
        Person[] array = people.toArray();
        //then
        assertEquals(2, array.length);
    }


}