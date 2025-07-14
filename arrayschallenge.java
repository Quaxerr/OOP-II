
// EXERCISE 1 - Declaring an array and filtering the elements

public class Exercise1 {
    public static void main(String[] args) {
        String[] productCodes = {"X101", "Y202", "X303", "Z404", "X505", "W606"};

        for (String code : productCodes) {
            if (code.startsWith("X")) {
                System.out.println(code);
            }
        }
    }
}

// EXERCISE 2 - Generate 5 random tracking numbers (e.g., M123, P456)

import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] trackingNumbers = new String[5];

        for (int i = 0; i < trackingNumbers.length; i++) {
            char prefix = (char)(rand.nextInt(4) + 'M'); // Letters from M to P
            int digits = rand.nextInt(900) + 100;        // Numbers from 100 to 999
            trackingNumbers[i] = prefix + Integer.toString(digits);
        }

        for (String tracking : trackingNumbers) {
            System.out.println(tracking);
        }
    }
}

// EXERCISE 3 - SORT and REVERSE elements in a string array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        String[] students = {"Zara", "Ali", "Brian", "Monica"};

        System.out.println("Sorted:");
        Arrays.sort(students);
        for (String name : students) {
            System.out.println("-- " + name);
        }

        System.out.println("\nReversed:");
        List<String> nameList = Arrays.asList(students);
        Collections.reverse(nameList);
        for (String name : nameList) {
            System.out.println("-- " + name);
        }
    }
}

// EXERCISE 4 - CLEAR elements in a string array


import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        String[] sections = {"F101", "E202", "F303", "G404"};

        System.out.println("Before: " + sections[1].toLowerCase());

        Arrays.fill(sections, 0, 2, null); // Clear first two

        if (sections[1] != null) {
            System.out.println("After: " + sections[1].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        System.out.println("Array contents:");
        for (String sec : sections) {
            System.out.println("-- " + sec);
        }
    }
}
