public class Bird implements AirAnimal, Animal {
    public void makeSound() {
        System.out.println("Say: Chirp Chirp!");
    }

    public void fly() {
        System.out.println("Bird is flying!");
    }

    public void walk() {
        System.out.println("Bird is walking!");
    }
}
