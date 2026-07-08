import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String str = sc.nextLine();

        System.out.println("Enter your Age :");
        int age = sc.nextInt();

        System.out.printf(" \n collage :  %10s", "Mother Teresa Institution");
        System.out.printf("\n   Name : %2s", str);
        System.out.printf("\n   Age  : %2d", age);

        sc.close();
    }
}

