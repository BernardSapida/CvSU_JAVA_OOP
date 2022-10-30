public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Bolt", "White", "Shih tzu", 3);
        Cat cat = new Cat("Kitty", "Black", "Ragdoll", 5);

        System.out.println("\n=============================================================\n");
        dog.displayInformations();
        dog.makeSound();
        System.out.println("\n=============================================================\n");
        cat.displayInformations();
        cat.makeSound();
        System.out.println("\n=============================================================\n");
    }
}