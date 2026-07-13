import java.util.Scanner;

public class TwoArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] a  = new int[2][5];

        for(int i =0 ; i<a.length; i++)
        {
            for(int j =0 ;j<a[i].length;j++)
            {
                 System.out.println("Enter the age of class "+i+" student "+j);
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The ages are:");
        
        for(int i =0 ; i<a.length; i++)
        {
            for(int j =0 ;j<a[i].length;j++)
            {
                 System.out.print(a[i][j]);
            }
        }
        
    }
}
