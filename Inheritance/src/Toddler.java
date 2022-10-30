public class Toddler extends Person {
    public String favoriteFood;

    Toddler(String name, String sex, int age, String favoriteFood) {
        super(name, sex, age);
        this.favoriteFood = favoriteFood;
    }

    void makeProgram() {
        System.out.println("I am coding");
    }

    public void displayStatus() {
        super.displayStatus();
        System.out.println("Favorite: " + favoriteFood);
    }
}
