import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the Number to Print Sum of that number:");
        int n=data.nextInt();
        int sum=0;
        while(n<=0){
            sum +=n;
        }
        System.out.println("Sum of N is :"+sum);
    }
}