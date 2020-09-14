package homework.lesson8;

public class Quadrangle {

    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private String colour = "red";
    private String material = "wood";

    public Quadrangle(){

    }
    public Quadrangle(double side1, double side2, double side3, double side4){

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public double perimeter(){
        return this.side1 + this.side2 + this.side3 + this.side4;
    }
    public String colour(){
        return this.colour;
    }
    public  String material(){
        return  this.material;
    }

}
