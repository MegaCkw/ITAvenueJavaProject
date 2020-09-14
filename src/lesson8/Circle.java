package lesson8;

public class Circle {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimetr() {
        return 2 * Math.PI * this.radius;


    }
//дз создать дерево наследования фигур. фигура имеет цвет и материал. нужно создать параллелограмм прямоугольник трапецию квадрат. задача выстроить правильное древо взаимоотношений (классы)
    // четырехугольник -> остальные фигуры.

}
