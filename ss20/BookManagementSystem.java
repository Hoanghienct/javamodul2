package ss20;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title/Author");
            System.out.println("4. Delete Book by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    manager.addBook();
                    break;
                case 2:
                    manager.displayBooks();
                    break;
                case 3:
                    manager.searchBooks();
                    break;
                case 4:
                    manager.deleteBook();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

