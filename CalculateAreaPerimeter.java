public class CalculateAreaPerimeter {

    public static void main(String[] args) {
        double width = 3.0;
        double length = 2.0;

        double area = calculateArea(width, length); 
        double perimeter = calculatePerimeter(width, length);

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }

    private static double calculatePerimeter(double width, double length) {
        return 2*(width + length);
    }

    private static double calculateArea(double width, double length) {
        return width*length;
    }
}
