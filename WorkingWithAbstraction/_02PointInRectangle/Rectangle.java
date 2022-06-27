package _02PointInRectangle;

public class Rectangle {
    Point bottomLeft;
    Point topRight;

    public Rectangle(Point p1,Point p2){
        this.bottomLeft=p1;
        this.topRight=p2;
    }
    public boolean Contains(Point point){
        return point.getX() >= bottomLeft.getX() && point.getY() >= bottomLeft.getY() &&
                point.getX() <= topRight.getX() && point.getY() <= topRight.getY();
    }
}
