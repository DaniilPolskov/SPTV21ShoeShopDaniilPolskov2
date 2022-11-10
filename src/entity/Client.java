package entity;

public class Client {
    private String firstName;
    private String lastName;
    private int startBalance;

    public int getBalance() {
        return startBalance;
    }

    public void setBalance(int balance) {
        this.startBalance = balance;
    }

    public Client() {
    }

    public Client(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                    ", balance=" + startBalance +
                '}';
    }
}