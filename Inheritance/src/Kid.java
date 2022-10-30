public class Kid extends Toddler {
    public int gradeLevel;

    Kid(String name, String sex, int age, String favoriteFood, int gradeLevel) {
        super(name, sex, age, favoriteFood);
        this.gradeLevel = gradeLevel;
    }

    public void displayCourse() {
        System.out.println("Grade Level: " + gradeLevel);
    }
}
