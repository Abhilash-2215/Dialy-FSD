public class StaticDemo {
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println("Square of 5: " + StaticDemo.square(5));
        System.out.println("Square of 10: " + square(10)); // direct call
    }
}
