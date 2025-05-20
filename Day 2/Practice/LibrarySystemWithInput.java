import java.util.Scanner;

class Book {
    String title;
    String author;
    Boolean isAvailable = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class Member {
    String name;

    Member(String name) {
        this.name = name;
    }

   public void borrowBook(Book[] books, int index) {
        if (index >= 0 && index < books.length && books[index] != null) {
            if (books[index].isAvailable) {
                books[index].isAvailable = false;
                System.out.println(name + "borrowed " + books[index].title);
            } else {
                System.out.println(books[index].title + "is not available.");
            }
        } else {
            System.out.println("invalid book index.");
        }
    }

   public void returnBook(Book[] books, int index) {
        if (index >= 0 && index < books.length && books[index] != null) {
            books[index].isAvailable = true;
            System.out.println(name + "returned " + books[index].title);
        } else {
            System.out.println("Invalid book index.");
        }
    }
}

public class LibrarySystemWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        int bookCount = 0;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Member member = new Member(name);

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    if (bookCount < books.length) {
                        System.out.print("Enter title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter author: ");
                        String author = sc.nextLine();
                        books[bookCount++] = new Book(title, author);
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Book storage full.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < bookCount; i++) {
                        System.out.print(i + ". ");
                        books[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter book index to borrow: ");
                    int borrowIndex = sc.nextInt();
                    member.borrowBook(books, borrowIndex);
                    break;

                case 4:
                    System.out.print("Enter book index to return: ");
                    int returnIndex = sc.nextInt();
                    member.returnBook(books, returnIndex);
                    break;

                case 5:
                    System.out.println("Exiting. Thank you!");
                    break;

                    default:
                     System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
