// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.time.Year;
public class Main {
    public static void main(String[] args) {
        inventory inventory = new inventory();

        // Create books
        Paper_Book paperBook = new Paper_Book("ISBN001", "Java Basics", 2020, 150.0f, "John Doe", 10);
        Ebook ebook = new Ebook("ISBN002", "Learn React", 2022, 100.0f, "Jane Smith", "pdf", "jane@example.com");
        Demo_Book demoBook = new Demo_Book("ISBN003", "Demo Guide", 2015, 0.0f, "Demo Author");

        // Add books
        inventory.Addbook(paperBook);
        inventory.Addbook(ebook);
        inventory.Addbook(demoBook);

        System.out.println("✅ Added 3 books to inventory.");

        // Try to buy a Paper Book
        try {
            float cost = inventory.buybook("ISBN001", 2, "buyer@example.com", "123 Main St");
            System.out.println("✅ Bought 2 Paper Books, total cost: " + cost);
        } catch (Exception e) {
            System.out.println("❌ Error buying paper book: " + e.getMessage());
        }

        // Try to buy an EBook
        try {
            float cost = inventory.buybook("ISBN002", 1, "buyer@example.com", "N/A");
            System.out.println("✅ Bought 1 EBook, total cost: " + cost);
        } catch (Exception e) {
            System.out.println("❌ Error buying ebook: " + e.getMessage());
        }

        // Try to buy a Demo Book (should fail)
        try {
            float cost = inventory.buybook("ISBN003", 1, "demo@example.com", "N/A");
            System.out.println("❌ Unexpected: Bought a demo book!");
        } catch (Exception e) {
            System.out.println("✅ Correctly failed to buy demo book: " + e.getMessage());
        }

        // Remove outdated books (published before 2017, for example)
        System.out.println("Removing outdated books (older than 7 years)...");
        List<Book> removed = inventory.removeBook(7);
        for (Book b : removed) {
            System.out.println("📚 Removed: " + b.getTitle());
        }

    }
}