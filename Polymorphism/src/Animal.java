public class Animal {
    String name, color, breed;
    int age;
     
    public void makeSound() {
        System.out.println("Please Override this method");
    }

    public void displayInformations() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }
}
