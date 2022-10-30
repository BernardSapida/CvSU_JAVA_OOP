public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Bolt", "White", "Shih tzu", 3);
        Cat cat = new Cat("Kitty", "Black", "Ragdoll", 5);

        System.out.println("\n=============================================================\n");
        dog.setAge(10);
        dog.displayInformations();
        dog.makeSound();
        dog.walk();
        System.out.println("\n=============================================================\n");
        cat.setAge(15);
        cat.displayInformations();
        cat.makeSound();
        cat.walk();
        System.out.println("\n=============================================================\n");
    }
}