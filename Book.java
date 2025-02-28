// Base class Book
class Book {
    // Attributes of Book class
    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize Book details
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter and setter methods for Book class
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

// Derived class Fiction, extending Book class
class Fiction extends Book {
    // Additional attribute specific to Fiction
    private String genre;

    // Constructor to initialize Fiction book details
    public Fiction(String title, String author, String ISBN, String genre) {
        super(title, author, ISBN); // Call base class constructor
        this.genre = genre;
    }

    // Getter and setter methods for Fiction class
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Override displayDetails to include Fiction specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base class method
        System.out.println("Genre: " + genre);
    }
}

// Derived class NonFiction, extending Book class
class NonFiction extends Book {
    // Additional attribute specific to NonFiction
    private String subject;

    // Constructor to initialize NonFiction book details
    public NonFiction(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN); // Call base class constructor
        this.subject = subject;
    }

    // Getter and setter methods for NonFiction class
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override displayDetails to include NonFiction specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call base class method
        System.out.println("Subject: " + subject);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create instances of Fiction and NonFiction books
        Fiction fictionBook = new Fiction("The Hobbit", "J.R.R. Tolkien", "978-0345339683", "Fantasy");
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", "978-0062316110", "History");

        // Display details of both books
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
    }
}
