// A Name object represents a person's name such as "John Q. Public".
public class Name {
    private String firstName;
    private char middleInitial;
    private String lastName;
    
    public Name(String first, char middle, String last) {
        firstName = first;
        middleInitial = middle;
        lastName = last;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public char getMiddleInitial() {
        return this.middleInitial;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setMiddleInitial(char mid) {
        this.middleInitial = mid;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }
}
