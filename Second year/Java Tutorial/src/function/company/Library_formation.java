package function_methods.com;
import java.util.Scanner;


// You have to implement a library using Java Class Library
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books
// Array to store the issued books

class Library{
    String []availableBooks = {
            "The Alchemist",
            "To Kill a Mockingbird",
            "1984",
            "The Great Gatsby",
            "Pride and Prejudice",
            "Animal Farm",
            "The Catcher in the Rye",
            "The Hobbit",
            "Harry Potter and the Sorcerer's Stone",
            "The Lord of the Rings",
            "The Da Vinci Code",
            "The Kite Runner",
            "The Fault in Our Stars",
            "The Hunger Games",
            "Life of Pi",
            "The Book Thief",
            "A Tale of Two Cities",
            "The Adventures of Sherlock Holmes",
            "Wuthering Heights",
            "Moby Dick",
            "Jane Eyre",
            "Little Women",
            "Brave New World",
            "War and Peace",
            "The Chronicles of Narnia",
            "The Girl on the Train",
            "The Shining",
            "The Time Machine",
            "The Invisible Man",
            "Fahrenheit 451",
            "Clean Code",
            "Head First Java",
            "Java: The Complete Reference",
            "Effective Java",
            "Introduction to Algorithms",
            "Data Structures and Algorithms Made Easy",
            "Design Patterns",
            "Operating System Concepts",
            "Computer Networks – Tanenbaum",
            "Artificial Intelligence: A Modern Approach",
            "Python Crash Course",
            "Learn C the Hard Way",
            "C++ Primer",
            "The Pragmatic Programmer",
            "Cracking the Coding Interview",
            "A Brief History of Time",
            "Sapiens",
            "The Power of Habit",
            "The 7 Habits of Highly Effective People",
            "Think and Grow Rich",
            "The Picture of Dorian Gray",
            "Crime and Punishment",
            "The Count of Monte Cristo",
            "Don Quixote",
            "Les Misérables",
            "The Old Man and the Sea",
            "The Sun Also Rises",
            "The Stranger",
            "The Road",
            "The Handmaid’s Tale",
            "Gone Girl",
            "The Girl with the Dragon Tattoo",
            "The Goldfinch",
            "The Poisonwood Bible",
            "The Secret Life of Bees",
            "The Help",
            "The Giver",
            "The Outsiders",
            "The Wind in the Willows",
            "The Call of the Wild",
            "The Iliad",
            "The Odyssey",
            "The Divine Comedy",
            "The Metamorphosis",
            "The Trial",
            "The Brothers Karamazov",
            "The Three Musketeers",
            "A Christmas Carol",
            "Great Expectations",
            "Oliver Twist",
            "The Jungle Book",
            "Treasure Island",
            "The Little Prince",
            "The Stranger",
            "The Color Purple",
            "Beloved",
            "The Bell Jar",
            "The Secret Garden",
            "The Shadow of the Wind",
            "The Name of the Wind",
            "Dune",
            "Neuromancer",
            "Ender's Game",
            "Foundation",
            "The Martian",
            "Ready Player One",
            "Jurassic Park",
            "The Andromeda Strain",
            "A Brief History of Nearly Everything",
            "Cosmos"
    };

    String [] issuedBooks = new String[100];
    int counter = 0;
    int bookCount = availableBooks.length;

    // Adding the book in library
    public void addBook(String book){

        if (bookCount >= availableBooks.length) {
            System.out.println("Library is full! Cannot add more books.");
            return;
        }

        book = book.trim();
        for (int i = 0; i < bookCount; i++){
            if (availableBooks[i]!= null && availableBooks[i].equalsIgnoreCase(book)){
                System.out.println("The Book is available in library");
                return;
            }
        }

        availableBooks[bookCount] = book;
        bookCount++;
        System.out.println("The book \"" + book + "\" is added");
    }

    //Issuing the book from library
    public void issuedBook(String book){
        book = book.trim();
        boolean found = false;

        for (int j = 0; j < bookCount; j++){
            if (availableBooks[j] != null && availableBooks[j].equalsIgnoreCase(book)){
                found = true;
                System.out.println("The book \"" + book + "\" is issued");
                issuedBooks[counter] = book;
                counter++;

                int idx = j;
                for (int i = idx; i < bookCount-1 ; i++) {
                    availableBooks[i] = availableBooks[i+1];
                }
                availableBooks[bookCount - 1] = null;
                bookCount --;
                break;
            }
        }
        if(!found )
            System.out.println("The book is not available");
    }


    // Returning the book
    public void returnBook(String book){
        book = book.trim();
        boolean issuedfound = false;

        for (int i = 0; i< counter; i++){
            if(issuedBooks[i] != null && issuedBooks[i].equalsIgnoreCase(book)) {
                issuedfound = true;

                for (int j = i; j < counter - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }

                issuedBooks[counter - 1] = null;
                counter--;
                break;
            }
        }

        if (!issuedfound){
            System.out.println("This book was not issued.");
            return;
        }

        availableBooks[bookCount]= book;
        bookCount ++ ;
        System.out.println("The Book " + book + " is returned.");
    }


    public void showAvailableBooks(){
        System.out.println("The available books are: ");
        for (int i = 0; i < bookCount  ; i++) {
            if(availableBooks[i] != null)
                System.out.println(availableBooks[i]);
        }
    }


}

public class Library_formation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();


        while (true) {
            System.out.println("\n1. Show Available Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Add Book");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice == 0){
                System.out.println("Exiting Library...");
                break;
            }

            switch (choice) {
                case 1:
                    lib.showAvailableBooks();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Which one you want to issue the book: ");
                    String b1 = sc.nextLine().trim();
                    lib.issuedBook(b1);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter the book name to return: ");
                    String b2 = sc.nextLine().trim();
                    lib.returnBook(b2);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter the book name to add: ");
                    String b3 = sc.nextLine().trim();
                    lib.addBook(b3);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
