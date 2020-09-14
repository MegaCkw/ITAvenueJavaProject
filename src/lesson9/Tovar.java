package lesson9;

import java.util.Arrays;
import java.util.Objects;

public class Tovar {
    private String mainName;
    private Otzyv[] otzyv = new Otzyv[10000];

    public Tovar() {
    }

    public Tovar(String mainName) {
        this.mainName = mainName;
    }

    public Tovar(String mainName, Otzyv[] otzyv) {
        this.mainName = mainName;
        this.otzyv = otzyv;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public Otzyv[] getOtzyv() {
        return otzyv;
    }

    public void setOtzyv(Otzyv[] otzyv) {
        this.otzyv = otzyv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return Objects.equals(mainName, tovar.mainName) &&
                Arrays.equals(otzyv, tovar.otzyv);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mainName);
        result = 31 * result + Arrays.hashCode(otzyv);
        return result;
    }
}
