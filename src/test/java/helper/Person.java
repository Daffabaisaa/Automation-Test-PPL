package helper;

public class Person {
    private String name;
    private int location;
    private String messageHeard;

    public Person(String name) {
        this.name = name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void hear(String message) {
        this.messageHeard = message;
    }

    public String getMessageHeard() {
        return messageHeard;
    }

    public String getName() {
        return name;
    }
}

