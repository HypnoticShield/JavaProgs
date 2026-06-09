package exp8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCharCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        sc.close();

        int wordCount = 0;
        int charCount = 0;
        boolean isWord = false;

        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (!Character.isWhitespace(ch)) {
                    charCount++;
                }
                if (Character.isLetterOrDigit(ch)) {
                    isWord = true;
                } else if (isWord) {
                    wordCount++; 
                    isWord = false;
                }
            }
            if (isWord) {
                wordCount++;
            }

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
