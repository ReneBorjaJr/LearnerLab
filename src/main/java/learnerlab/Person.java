package learnerlab;

public class Person {

    // declare a final field named id of type long
    private final long id;
    // declrare a field named name of type String
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
