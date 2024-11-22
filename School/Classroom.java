package School;

public class Classroom {
    public static void main(String[] args) {
        // Create instances of Student
        Student jojo = new Student("JoJo", true);
        Student lili = new Student("Lili", false);

        // Print their descriptions
        System.out.println(jojo.whoAmI());
        System.out.println(lili.whoAmI());
    }
}

