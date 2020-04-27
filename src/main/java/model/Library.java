package model;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }


    public void printAllBooks() {

        for (Book book : books
        ) {
            System.out.println(book);
        }
    }

    public void removeBook(Long id) throws LibraryException {

        if (isBook(id)) {
            Book[] newBooks = new Book[books.length - 1];
            for (int i = 0, k = 0; i < books.length; i++) {
                if (books[i].getId().equals(id)) {
                    System.out.println("Usuwanie ksiazki o id: " + id + "\n");
                } else {
                    newBooks[k++] = books[i];
                }
            }
            this.books = newBooks;
        } else {
            throw new LibraryException("Podana ksiazka nie widnieje w bibliotece, więc nie można jej usunąć");
        }
    }

    private boolean isBook(Long id) {

        for(Book book : books){
            if (book.getId().equals(id)) {
                return true;
            }

        }
        return false;
    }

    public void addBooks(Book book){

        for (int i = 0; i <books.length ; i++) {
            if(book.getIsbn().equals(books[i].getIsbn())){
                System.out.println("Nie mozna dodac takiej ksiazki do biblioteki");
                return;
            }
        }


        Book[] newBookArray = new Book[books.length + 1];

        for (int i = 0; i < newBookArray.length ; i++) {
            if(i == newBookArray.length - 1){
                newBookArray[newBookArray.length - 1] = book;
            }else{
                newBookArray[i] = books[i];
            }
        }

        this.books = newBookArray;

    }
}