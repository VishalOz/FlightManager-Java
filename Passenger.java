public class Passenger {
    private String passengerId;
    private String name;
    private String email;

    public Passenger (String passengerId, String name, String email) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
    }

    //getters
    public String getPassengerId() {
        return passengerId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String toString() {
        return name + " (" + email + ")";
    }

}
