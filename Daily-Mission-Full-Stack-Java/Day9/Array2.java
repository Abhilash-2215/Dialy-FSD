import java.util.Scanner;

public class Array2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }   
        int min=arr[0];
        int max=arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Minimum element is  "+min);
        System.out.println("Maximum element is  "+max);
    
    
    }


}
