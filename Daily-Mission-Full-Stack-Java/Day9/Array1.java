import java.util.Arrays;
import java.util.Scanner;
public class Array1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" +n+ "elements");
        for(int i =0;i<arr.length;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        System.out.println("array elements");
        for(int j=0;j<n;j++)
            {
                System.out.println(arr[j]);
                
            }   
            System.out.println("Sorted Array");
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr)); 
        }
}
