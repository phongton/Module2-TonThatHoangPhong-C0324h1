package InhertancePolymophism.baithCircle;

public class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape() {

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(String color) {
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return " A shape with Color: " + getColor() + " Filled: " + (isFilled()?"filled":"not filled");
    }
    public double getArea(){
        return getArea();
    }

}
 class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("green", false);
        System.out.println(shape);
    }
}


