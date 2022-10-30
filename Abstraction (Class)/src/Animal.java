public abstract class Animal {
    String name, color, breed;
    int age;
     
    public abstract void makeSound();
    public abstract void walk();

    public void displayInformations() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
