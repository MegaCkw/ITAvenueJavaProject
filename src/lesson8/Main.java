package lesson8;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        double perimetr = circle.perimetr();
        System.out.println(perimetr);

        Oval oval = new Oval(3,6);
        oval.perimetr();
        System.out.println(oval.perimetr());


    }


}

