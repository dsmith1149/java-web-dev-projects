package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer newId;

        System.out.println("Enter your students' IDs and names (or ENTER to finish):");

        // Get student IDs and names
        while (true) {
            System.out.print("ID (integer): ");
            String idInput = input.nextLine();

            if (idInput.equals("")) {
                break; // Exit the loop if the user presses ENTER without inputting an ID
            }

            try {
                newId = Integer.parseInt(idInput); // Convert the ID to an integer

                System.out.print("Student name: ");
                newStudent = input.nextLine();

                students.put(newId, newStudent);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer ID.");
            }
        }

        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " | Name: " + student.getValue());
        }

        input.close();
    }
}
