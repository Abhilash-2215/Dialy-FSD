class Car {
    String brand;
    int year;

    Car() {
        brand = "Unknown";
        year = 0;
    }

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Tesla", 2025);

        c1.display();
        c2.display();
    }
}
