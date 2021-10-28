public class NinthGrader extends Student { // SOME CODE NEEDED IN THIS LINE
    public NinthGrader (String firstName, String lastName) {
        super (firstName,lastName,2025);
    }
    public void doSomething () {
        System.out.println("I am preparing for a Harkness discussion!");
    }
    public String toString() {
        return super.toString()+" (9th Grader)";
    }
}
