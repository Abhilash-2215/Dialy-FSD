import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        char grade=data.nextLine().charAt(0);
        String result=switch (grade) {
            case 'A' -> { yield "90 to 100";}
            case 'B' -> { yield "80 to 90";}
            case 'c' -> { yield "70 to 80";}
            case 'D' -> { yield "60 to 70";}
            default -> {yield "enter a vaid grade";}
        };
        System.out.println("garde:"+result);
    }
    
}
