package _02Shapes;

public class Circle extends Shape {

    private Double radius;

    protected void setRadius(Double radius){
        if (radius<=0){
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }

    public Circle (Double radius){
        setRadius(radius);
    }
    public final Double getRadius(){
        return radius;
    }
    @Override
    public void calculatePerimeter() {
        this.setPerimeter(2*Math.PI*radius);
    }

    @Override
    public void calculateArea() {
        this.setArea(Math.PI*radius*radius);
    }
}
