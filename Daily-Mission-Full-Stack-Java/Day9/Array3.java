import java.util.Arrays;
import java.util.Scanner;

public class Array3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];  
        int sum = 0;
        int avg = 0; 
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum of the array is :"+sum);
        avg= sum/n;
        System.out.println("average of the array is :"+avg);
        Arrays.sort(arr);
        System.out.println("The sorted array is "+Arrays.toString(arr));
    }    
}
