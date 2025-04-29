import java.util.Scanner;

class BirthYearCalculator {
    Scanner scanner = new Scanner(System.in);

    public void calculateBirthYear() {
        String name;
        int age;
        int currentYear = 2025; // You can update this yearly

        System.out.print("What's your name? ");
        name = scanner.next();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        int birthYear = currentYear - age;
        System.out.println("Hey " + name + "! You were likely born in " + birthYear + ".");
    }

    public static void main(String[] args) {
        (new BirthYearCalculator()).calculateBirthYear();
    }
}