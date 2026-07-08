import java.util.Scanner;
public class InputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        System.out.println("Enter a String: ");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println(a);
        System.out.println(str);

    }
}
