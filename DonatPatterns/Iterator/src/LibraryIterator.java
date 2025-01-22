class LibraryIterator implements Iterator<Book> {
    private Book[] books;
    private int position = 0;
    private int size;

    public LibraryIterator(Book[] books, int size) {
        this.books = books;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return position < size && books[position] != null;
    }

    @Override
    public Book next() {
        return books[position++];
    }
}
