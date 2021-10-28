public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName2, String lastName2) {
        firstName = firstName2;
        lastName = lastName2;
    }
    public void doSomething() {
        System.out.println("I am watching Netflix");
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lst) {
        lastName = lst;
    }
    public void setFirstName(String fst) {
        firstName = fst;
    }
}
