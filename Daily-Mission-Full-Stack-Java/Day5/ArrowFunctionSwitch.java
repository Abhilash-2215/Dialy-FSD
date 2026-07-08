public class ArrowFunctionSwitch {
    public static void main(String[] args) {
        String season="summer";
        switch (season) {
        case "summer" -> System.out.println("wear sunglasses");
        case "winter" -> System.out.println("wear hoodie");
        case "spring" -> System.out.println("flowers are beautyful");
        default -> System.out.println("enetr a valid season");
        }
    }
}
