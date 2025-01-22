class Library implements BookCollection {
    private Book[] books;
    private int size = 0;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books, size);
    }
}
