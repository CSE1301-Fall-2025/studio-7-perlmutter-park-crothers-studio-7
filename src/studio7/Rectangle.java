
public class Rectangle {

    public double length;
    public double width;

   
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }

   
    public double getPerimeter() {
        return 2 * (length + width);
    }


    public boolean isSquare() {
        return length == width;
    }


    public boolean isSmaller(Rectangle other) {
        return this.getArea() < other.getArea();
    }

   
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(10, 10);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("r1 is square? " + r1.isSquare());
        System.out.println("r2 is square? " + r2.isSquare());
        System.out.println("r1 smaller than r2? " + r1.isSmaller(r2));
    }
}
