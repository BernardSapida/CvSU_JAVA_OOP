public class App {
    public static void main(String[] args) throws Exception {
        User user = new User(0, "JohnDoe", "John", "Doe");
        
        user.setUsername("BernardSapida17");
        user.setFirsname("Bernard");
        user.setLastname("Sapida");

        System.out.println("\n=============================================================\n");
        System.out.println("USER_ID: " + user.getUserID());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Fullname: " + user.getFullname());
        System.out.println("\n=============================================================\n");
    }
}
