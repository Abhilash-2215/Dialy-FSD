public class pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {          // rows
            for (int j = 0; j < 10; j++) {      // columns
                System.out.print("*   ");       // print stars with spacing
            }
            System.out.println();               // move to next line after each row
        }
    }
}
