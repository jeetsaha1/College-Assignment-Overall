package Week6;

abstract class AbstractProduct {

    protected int productId;
    protected String name;
    protected String description;

    AbstractProduct(int productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    abstract void display();
}

class Product extends AbstractProduct {

    protected double price;

    Product(int productId, String name, String description, double price) {
        super(productId, name, description);
        this.price = price;
    }

    void display() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name : " + name);
        System.out.println("Description : " + description);
        System.out.println("Price : " + price);
    }
}

class Book extends Product {

    protected String ISBN;
    protected String author;
    protected String title;

    Book(int productId, String name, String description,
         double price, String ISBN, String author, String title) {

        super(productId, name, description, price);
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("ISBN : " + ISBN);
        System.out.println("Author : " + author);
        System.out.println("Title : " + title);
    }
}

class TravelGuide extends Book {

    protected String country;

    TravelGuide(int productId, String name, String description,
                double price, String ISBN, String author,
                String title, String country) {

        super(productId, name, description, price, ISBN, author, title);
        this.country = country;
    }

    void display() {
        super.display();
        System.out.println("Country : " + country);
    }
}

class CompactDisc extends Product {

    protected String artist;
    protected String title;

    CompactDisc(int productId, String name, String description,
                double price, String artist, String title) {

        super(productId, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Artist : " + artist);
        System.out.println("Title : " + title);
    }
}

public class prog11 {

    public static void main(String[] args) {

        Book b = new Book(101, "Java Book", "Programming Book",
                500, "ISBN1234", "James Gosling", "Learn Java");

        CompactDisc cd = new CompactDisc(201, "Music CD",
                "Pop Album", 300, "Taylor Swift", "1989");

        TravelGuide tg = new TravelGuide(301, "Travel Guide",
                "Tour Book", 400, "ISBN9999",
                "John Doe", "Europe Guide", "France");

        System.out.println("\n--- Book Details ---");
        b.display();

        System.out.println("\n--- Compact Disc Details ---");
        cd.display();

        System.out.println("\n--- Travel Guide Details ---");
        tg.display();
    }
}