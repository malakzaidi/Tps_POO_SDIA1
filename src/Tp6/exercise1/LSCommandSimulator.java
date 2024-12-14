package Tp6.exercise1;
import java.io.File;
import java.util.Scanner;
public class LSCommandSimulator {

    // Method to display file/directory information
    public static void displayFileInfo(File file) {
        String type = file.isDirectory() ? "<DIR>" : "<FILE>";
        String read = file.canRead() ? "r" : "-";
        String write = file.canWrite() ? "w" : "-";
        String hidden = file.isHidden() ? "h" : "-";

        System.out.printf("%s %s %s%s%s%n", file.getAbsolutePath(), type, read, write, hidden);
    }
    // Recursive method to list files and directories
    public static void listDirectory(File dir) {
        // Ensure the given file object is a directory
        if (!dir.isDirectory()) {
            System.out.println(dir.getAbsolutePath() + " is not a directory.");
            return;
        }

        // List all files and directories in the current directory
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                displayFileInfo(file); // Display information
                if (file.isDirectory()) {
                    listDirectory(file); // Recursively list subdirectories
                }
            }
        } else {
            System.out.println("Unable to access: " + dir.getAbsolutePath());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full path of the directory:");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (directory.exists()) {
            listDirectory(directory); // Start listing from the given directory
        } else {
            System.out.println("The specified path does not exist.");
        }
        scanner.close();
    }
}
