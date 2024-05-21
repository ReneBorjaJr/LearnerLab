package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class People implements Iterator<Person> {


    private List<Person> personList = new ArrayList<>();


    public void add(Person person) {
        personList.add(person);
    }


    public boolean findById(long id) {
        if (personList.isEmpty()) {
            System.out.println("no person to find");
            return false;
        }
        for (Person person : personList) {
            if (person.getId() == id) {
                return true;
            }
        }
        System.out.println("ID not found");
        return false;
    }


    public boolean contains(Person person) {
        if (person == null) {
            System.out.println("no person to find");
        }
        return personList.contains(person);
    }


    public void remove(Person person) {
        if (person == null) {
            System.out.println("no person to remove");
        } else if (!personList.contains(person)) {
            System.out.println("person not found");
        }
        personList.remove(person);
    }

    public void removeById(long id) {
        if (personList.isEmpty()) {
            System.out.println("no person to remove");
            return;
        } if (!findById(id)) {
            System.out.println("person not found");
            return;
        }
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    public void removeAll() {
        if (personList.isEmpty()) {
            System.out.println("no person to remove");
        }
        personList.clear();
    }

    // define a method named count which returns the size of personList
    public int count() {
        if (personList.isEmpty()) {
            System.out.println("List is empty");
            return 0;
        }
        int count = 0;
        for (Person person : personList) {
            if (person != null) {
            count++;
        }
    }
        return count;
    }



    public Person[] toArray() {
        if (personList.isEmpty()) {
            System.out.println("No person to convert to array");
            return new Person[0];
        }
        return personList.toArray(new Person[personList.size()]);
    }


    public Iterator<Person> iterator() {
        if (personList.isEmpty()) {
            System.out.println("no person to iterate");
        }
        return personList.iterator();
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Person next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Person> action) {
        Iterator.super.forEachRemaining(action);
    }
}
