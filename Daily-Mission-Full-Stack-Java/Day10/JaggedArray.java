import java.util.Scanner;

public class ThreeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][][];

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[3][];
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter number of students in school " + i + " class " + j);
                int students = sc.nextInt();
                a[i][j] = new int[students];
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("Enter the age of school " + i + " class " + j + " student " + k);
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("School " + i + " Class " + j + " Student " + k + " Age: " + a[i][j][k]);
                }
            }
        }

        sc.close();
    }
}
