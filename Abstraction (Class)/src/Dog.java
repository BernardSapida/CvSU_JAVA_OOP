public class Dog extends Animal {
    Dog(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Say: ARF ARF!");
    }

    public void walk() {
        System.out.println("Dog is walking!");
    }
}
