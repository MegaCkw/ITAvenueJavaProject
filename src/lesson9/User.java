package lesson9;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String email;
    private Date dateRegistration;
    private Otzyv[] otzyvFromUser = new Otzyv[1000];

    public User() {
    }

    public User(String userName, String email, Date dateRegistration) {
        this.userName = userName;
        this.email = email;
        this.dateRegistration = dateRegistration;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Otzyv[] getOtzyvFromUser() {
        return otzyvFromUser;
    }

    public void setOtzyvFromUser(Otzyv[] otzyvFromUser) {
        this.otzyvFromUser = otzyvFromUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(dateRegistration, user.dateRegistration) &&
                Arrays.equals(otzyvFromUser, user.otzyvFromUser);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(userName, email, dateRegistration);
        result = 31 * result + Arrays.hashCode(otzyvFromUser);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", dateRegistration=" + dateRegistration +
                ", otzyvFromUser=" + Arrays.toString(otzyvFromUser) +
                '}';
    }


}
