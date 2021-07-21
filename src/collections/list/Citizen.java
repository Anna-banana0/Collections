package collections.list;

public class Citizen {
    String firstName;
    int citizenId;
    String lastName;

    public Citizen(String firstName, int citizenId, String lastName) {
        this.firstName = firstName;
        this.citizenId = citizenId;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(int citizenId) {
        this.citizenId = citizenId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
