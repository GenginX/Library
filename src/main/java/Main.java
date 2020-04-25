import model.Book;
import model.Library;
import model.LibraryException;

import java.util.Scanner;

public class Main {
    private static Scanner s;

    public static void main(String[] args) {

        Library library = createLibraryWithBooks();

        System.out.println("Witaj w bibliotece! Co moge dla Ciebie zrobic?");

        while (true) {
            Scanner s = new Scanner(System.in);
            String view = "Wyświetl wszystkie ksiażki";
            String add = "Dodaj książkę";
            String remove = "Usuń książkę";


            System.out.println("1) " + view);
            System.out.println("2) " + add);
            System.out.println("3) " + remove);
            System.out.println("Wybieram: ");

            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    library.printAllBooks();
                    break;
                case 2:
                    System.out.println("Podaj autora ksiazki: ");
                    s.nextLine();
                    String author = s.nextLine();
                    System.out.println("Podaj tytul ksiazki: ");
                    String title = s.nextLine();
                    s.nextLine();
                    System.out.println("Podaj isbn ksiazki: ");
                    String isbn = s.nextLine();
                    Book newBook = new Book(author,title,isbn);
                    library.addBooks(newBook);
                    break;
                case 3:
                    System.out.println("Podaj numer ID ksiazki ktora chcesz usunac: ");
                    Long removeBookId = s.nextLong();
                    try {
                        library.removeBook(removeBookId);
                        System.out.println("Ksiazka usunieta");
                    } catch (LibraryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Zly wybor");
                    break;
            }

        }

//    public static void inteface(){
//        while(true){
//
//            String view = "Wyświetl wszystkie ksiażki";
//            String add = "Dodaj książkę";
//            String remove = "Usuń książkę";
//
//            System.out.println("Witaj w bibliotece! Co moge dla Ciebie zrobic?");
//            System.out.println("1) " + view);
//            System.out.println("2) " + add);
//            System.out.println("3) " + remove);
//            System.out.println("Wybieram: ");
//            Scanner s = new Scanner(System.in);
//            int choice = s.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("[" + view + "] jeszcze nie zaimplementowana/e");
//                    break;
//                case 2:
//                    System.out.println("[" + add + "] jeszcze nie zaimplementowana/e");
//                    break;
//                case 3:
//                    System.out.println("[" + remove + "] jeszcze nie zaimplementowana/e");
//                    break;
//                default:
//                    System.out.println("Zly wybor");
//
//            }
//
//            System.out.println();
//
//        }
//    }

    }

    private static Library createLibraryWithBooks() {
        return new Library(new Book[]{
                new Book("Juliusz Słowacki", "Balladyna", "9788373272170"),
                new Book("Jan Brzechwa", "Akademia pana Kleska", "9788371530326"),
                new Book("Arkady Fiedler", "Dywizjon 303", "9788381271738"),
                new Book("Henryk Sienkiewicz", "Latarnik", "9788387139803"),
                new Book("Juliusz Słowacki", "Kordian", "9788389524027")
        });
    }

}

