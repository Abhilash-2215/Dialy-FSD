class Rectangle {
    int length, width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    Rectangle(int side) {
        length = side;
        width = side;
    }

    int area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(7);

        System.out.println("Area r1: " + r1.area());
        System.out.println("Area r2: " + r2.area());
        System.out.println("Area r3: " + r3.area());
    }
}
