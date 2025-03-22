package person;

public abstract class Person {
    
    private String id;
    protected String name;
    public static int count = 0;

    public Person() { 
        id = "User" + count++; 
    }

    public Person(String name) { 
        this(); 
        this.name = name; 
    }

    public abstract String getCustomerType();

    public String data() { 
        return name; 
    }

    public String data(boolean withId) { 
        if (withId) {
            return id + ": " + name;
        } else {
            return name;
        }
    }

}
