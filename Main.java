// Calculates and prints the area of a rectangle
class RectangleArea {

    void calculateArea() {
        double length;    // Length of the rectangle
        double width;     // Width of the rectangle
        double area;

        length = 10.5;
        width = 4.2;

        area = length * width;
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        (new RectangleArea()).calculateArea();
    }
}
