public class PersonClient {
    public static void main(String[] args) {
        // Write some very very basic testing code here
        // Create a Person and then call each of the
        // methods on the Person
        Person myPerson = new Person("Hate", "Love");
        System.out.println(myPerson.getFirstName());
        System.out.println(myPerson.getLastName());
        System.out.println(myPerson);
        myPerson.doSomething();
    }
}