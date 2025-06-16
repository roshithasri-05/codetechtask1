import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileHandlingUtility {

    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== FILE HANDLING UTILITY ===");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Modify file content");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    writeToFile(scanner);
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    modifyFileContent(scanner);
                    break;
                case 4:
                    System.out.println("Exiting utility.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    /**
     * Writes the file. Overwrites existing content.
     */
    private static void writeToFile(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            System.out.println("Enter text to write to the file:");
            String content = scanner.nextLine();
            writer.write(content);
            System.out.println("Successfully written to " + FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads the file and displays it.
     */
    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            System.out.println("\n--- File Content ---");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--- End of File ---");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Try writing to it first.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    /**
     * Modifies specific word in the file by replacing a specific word.
     */
    private static void modifyFileContent(Scanner scanner) {
        try {
            System.out.print("Enter word to replace: ");
            String target = scanner.nextLine();
            System.out.print("Enter new word: ");
            String replacement = scanner.nextLine();

            Path path = Paths.get(FILE_PATH);
            if (!Files.exists(path)) {
                System.out.println("File does not exist. Write something first.");
                return;
            }

            String content = new String(Files.readAllBytes(path));
            content = content.replaceAll(target, replacement);
            Files.write(path, content.getBytes());

            System.out.println("Content updated successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
}
