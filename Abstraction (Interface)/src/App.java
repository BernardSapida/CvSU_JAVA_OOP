public class App {
    public static void main(String[] args) throws Exception {
        Bird bird = new Bird();
        Cat cat = new Cat();
        Frog frog = new Frog();

        System.out.println("\n=============================================================\n");
        System.out.println("** CAT **");
        cat.makeSound();
        cat.walk();
        System.out.println("\n=============================================================\n");
        System.out.println("** FROG **");
        frog.makeSound();
        frog.walk();
        frog.swim();
        System.out.println("\n=============================================================\n");
        System.out.println("** BIRD **");
        bird.makeSound();
        bird.walk();
        bird.fly();
        System.out.println("\n=============================================================\n");
    }
}