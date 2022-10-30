public class User {
    private int userID;
    private String username, firstname, lastname;

    User(int userID, String username, String firstname, String lastname) {
        this.userID = userID;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirsname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getters
    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return firstname + " " + lastname;
    }
}
