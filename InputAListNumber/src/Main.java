import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = Input.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numArray[i] = Input.nextInt();
        }
        System.out.println("Input numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(numArray[i] + " ");
        }
    }
}
