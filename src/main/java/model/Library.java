package model;

public class Library {

    private Book[] books;

    public Library(Book[] books){
        this.books = books;
    }


    public void printAllBooks() {

        for (Book book : books
        ) {
            System.out.println(book);

        }

    }

}
