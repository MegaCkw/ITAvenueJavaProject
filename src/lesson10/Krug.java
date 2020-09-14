package lesson10;

public class Krug implements Figura, Tovar{
    private int radius;

    public Krug() {
    }

    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double ploshad() {
        return 3.14 * radius * radius;
    }

    @Override
    public void buy() {
        System.out.println("Товар продан");
    }
}
