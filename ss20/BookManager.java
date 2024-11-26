package ss20;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

        private ArrayList<Book> books = new ArrayList<>();
        private Scanner scanner = new Scanner(System.in);

        public void addBook() {
            System.out.println("Enter Book ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.println("Enter Book Title:");
            String title = scanner.nextLine();

            System.out.println("Enter Book Author:");
            String author = scanner.nextLine();

            System.out.println("Enter Book Price:");
            double price = scanner.nextDouble();

            books.add(new Book(id, title, author, price));
            System.out.println("Book added successfully!");
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books available.");
                return;
            }

            System.out.println("Book List:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public void searchBooks() {
            System.out.println("Enter title or author to search:");
            String query = scanner.nextLine().toLowerCase();

            boolean found = false;
            for (Book book : books) {
                if (book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) {
                    System.out.println(book);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matching books found.");
            }
        }

        public void deleteBook() {
            System.out.println("Enter Book ID to delete:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            Book toRemove = null;
            for (Book book : books) {
                if (book.getId() == id) {
                    toRemove = book;
                    break;
                }
            }

            if (toRemove != null) {
                books.remove(toRemove);
                System.out.println("Book removed successfully!");
            } else {
                System.out.println("Book with ID " + id + " not found.");
            }
        }
    }

