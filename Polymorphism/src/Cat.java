public class Cat extends Animal {
    Cat(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Say: MEOW MEOW!");
    }
}
