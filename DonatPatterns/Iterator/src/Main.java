public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("To Kill a Mockingbird"));
        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("To Kill a Mockingbird"));

        Iterator<Book> iterator = library.createIterator(); // Correctly initialized

        System.out.println("Books in the library:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("- " + book.getTitle());
        }


    }
}