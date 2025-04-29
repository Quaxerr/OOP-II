import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        while (n > 0) {
            System.out.println(n);
            n--;  // Decrease n by 1 each time
        }

        System.out.println("Blast off!");
        scanner.close();
    }
}