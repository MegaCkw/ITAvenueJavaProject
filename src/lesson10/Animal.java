package lesson10;

public abstract class Animal {
    private String name;

    public void printName() {
        System.out.println(name);
    }

    abstract void voice();

    abstract void jump();

}
