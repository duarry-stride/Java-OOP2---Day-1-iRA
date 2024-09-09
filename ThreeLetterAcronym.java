// Write a program that allows a user to enter three words,
// and display the appropriate three-letter acronym in all uppercase letters.
// If the user enters more than three words, ignore the extra words.
//Save the file as ThreeLetterAcronym.java.

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type three words:");
        String input = scanner.nextLine();

        // Split the input into an array of words based on spaces.
        String[] words = input.split(" ");

        // Determine the number of words to use (up to 3).
        int minWords = Math.min(words.length, 3);

        // Create a StringBuilder to build the acronym variable.
        StringBuilder acronym = new StringBuilder();

        // Loop through the first 'minWords' words,
        // taking the first character of each word, converting it to uppercase,
        // and appending it to the acronym.
        for (int i = 0; i < minWords; i++){
            acronym.append(Character.toUpperCase(words[i].charAt(0)));
        }

        // Print the resulting acronym
        System.out.println(acronym);

        // Close the Scanner to free up resources
        scanner.close();
    }
}
