public class Frog implements Animal, LandAnimal, WaterAnimal {
    public void makeSound() {
        System.out.println("Say: Ribbit Ribbit!");
    }

    public void walk() {
        System.out.println("Dog is walking!");
    }

    public void swim() {
        System.out.println("Frog swims!");
    }
}
