package ru.mirea.task2.opt7;

public class BookShelf {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public void addBook(int position, String author, String name, int year){
        books[position] = new Book(author, name, year);
    }

    public Book getLatestBook(){
        int latestPos = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() > books[latestPos].getYear()){
                latestPos = i;
            }
        }
        return books[latestPos];
    }

    public Book getEarliestBook(){
        int earliestPos = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() < books[earliestPos].getYear()){
                earliestPos = i;
            }
        }
        return books[earliestPos];
    }

    public void sortBooksByYear(){
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getYear() > books[i + 1].getYear()){
                Book temp = books[i];
                books[i] = books[i + 1];
                books[i + 1] = temp;

                i = -1;
            }
        }
    }

    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < books.length; i++) {
            res += i + ") " + books[i].toString();
            res += "\n";
        }
        return res;
    }
}
