package lesson10;

public class Kvadrat implements Figura, Tovar {
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public double perimeter() {
        return a + a + a + a;
    }

    @Override
    public double ploshad() {
        return a * a;
    }

    @Override
    public void buy() {
        System.out.println("Квадрат продан");

    }
}
