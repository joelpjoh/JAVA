public class Rectangle {
    double length, breadth;
    
    void getData(double l, double b) {
        length = l;
        breadth = b;
    }
    
    double calArea() {
        return length * breadth;
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getData(12.48, 14);
        double area = rect.calArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
