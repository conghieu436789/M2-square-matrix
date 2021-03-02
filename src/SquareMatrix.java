import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter rows cols");
        int rows = input.nextInt();
        int[][] matrix = new int[rows][rows];
        for (int i =0; i<rows; i++) {
            System.out.printf("Row %d %n",i+1);
            for (int j=0; j<rows; j++) {
                System.out.printf("Enter number %d %n", j+1);
                matrix[i][j] = input.nextInt();
                if (i==j) {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("The matrix is:");
        for (int i=0; i<rows; i++) {
            for (int j =0; j<rows; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("The total is %d", sum);
    }
}
