package _02Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;


    protected void setPerimeter(Double perimeter) {
        if (perimeter <= 0) {
            throw new IllegalArgumentException("Invalid input!(perimeter)");
        }
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Invalid input!(area)");
        }
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public abstract void calculatePerimeter();
    public abstract void     calculateArea();
}
