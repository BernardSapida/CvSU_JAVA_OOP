public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Christian Sapida", "Male", 33);
        Toddler toddler = new Toddler("Bernard Sapida", "Male", 19, "Ramen");
        Kid kid = new Kid("Kylie Sapida", "Female", 12, "Carbonara", 7);

        System.out.println("\n=============================================================\n");
        System.out.println("** Person Information **");
        person.displayStatus();
        System.out.println("\n=============================================================\n");
        System.out.println("** Toddler Information **");
        toddler.displayStatus();
        System.out.println("\n=============================================================\n");
        System.out.println("** Kid Information **");
        kid.displayStatus();
        kid.displayCourse();
        System.out.println("\n=============================================================\n");
    }
}
