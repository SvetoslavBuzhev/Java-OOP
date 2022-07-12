package _02Shapes;

public class Rectangle extends Shape {
    private  Double height;
    private  Double width;

    protected void setHeight(Double Height){
        if (Height<=0){
            throw new IllegalArgumentException("Invalid height");
        }
        this.height = height;
    }
    protected void setWidth(Double width){
        if (width<=0){
            throw new IllegalArgumentException("Invalid height");
        }
        this.width = width;
    }
    public Rectangle (Double height,Double width){
        setHeight(height);
        setWidth(width);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        this.setPerimeter(2*(height+width));
    }

    @Override
    public void calculateArea() {
        this.setArea(height*width);
    }
}
