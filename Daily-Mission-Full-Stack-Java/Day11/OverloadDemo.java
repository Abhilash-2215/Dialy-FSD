class Method2 {
    double area(double side) {
        return side * side;
    }

    double area(double radius, char type) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Method2 s = new Method2();

        System.out.println("Square area: " + s.area(5));
        System.out.println("Circle area: " + s.area(3, 'c'));
        System.out.println("Triangle area: " + s.area(4, 6));
    }
}
