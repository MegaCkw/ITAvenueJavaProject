package lesson9;

import java.util.Date;
import java.util.Objects;

public class Otzyv {
    private int stars;
    private Date datePublish;
    private User user;
    private String textFromOtzyv;

    public Otzyv() {
    }

    public Otzyv(int stars, Date datePublish, User user, String textFromOtzyv) {
        this.stars = stars;
        this.datePublish = datePublish;
        this.user = user;
        this.textFromOtzyv = textFromOtzyv;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Otzyv otzyv = (Otzyv) o;
        return stars == otzyv.stars &&
                Objects.equals(datePublish, otzyv.datePublish) &&
                Objects.equals(user, otzyv.user) &&
                Objects.equals(textFromOtzyv, otzyv.textFromOtzyv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stars, datePublish, user, textFromOtzyv);
    }
}
