package model;

public class Book {

    private static long idCounter = 0L;

    private Long id;
    private String author;
    private String title;
    private String isbn;


    public Book(String author, String title, String isbn) throws ISBNException {
        this.author = author;
        this.title = title;
        this.isbn = validateISBN(isbn);
        this.id = idCounter++;
    }

    public static Long getIdCounter(){
        return idCounter;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "\n id: " + id +
                "\n author " + author +
                "\n title " + title +
                "\n Isbn " + isbn +
                "\n";
    }

    private String validateISBN(String isbn) throws ISBNException {

        Long isbnNumber = Long.valueOf(isbn);

        String regex = "\\d{13}$";
        boolean digitCount = isbn.matches(regex);

        boolean first3Digits = false;
        char[] isbnToCharArray = isbn.toCharArray();
        int firstNumber = Integer.parseInt((String.valueOf(isbnToCharArray[0])));
        int secondNumber = Integer.parseInt((String.valueOf(isbnToCharArray[1])));
        int thirdNumber = Integer.parseInt((String.valueOf(isbnToCharArray[2])));
        if(firstNumber == 9 && secondNumber == 7 && thirdNumber == 8){
            first3Digits = true;
        }

        boolean controlSum = false;
        int sumaIloczynu = 0;
        for (int i = 0; i < 12 ; i++) {
            int number = Integer.parseInt((String.valueOf(isbnToCharArray[i])));

            if(i == 0){
                sumaIloczynu += (number);
            }
            else if(i % 2 == 0){
                sumaIloczynu += (number);
            }
            else {
                sumaIloczynu += (number * 3);
            }
        }

        int moduloSum = sumaIloczynu % 10;

        int lastNumberofISBN;

        if(moduloSum != 0){
            lastNumberofISBN = 10 - moduloSum;
        }else{
            lastNumberofISBN = moduloSum;
        }

        if(first3Digits && digitCount && Integer.parseInt((String.valueOf(isbnToCharArray[12]))) == lastNumberofISBN){
            return isbn;
        }else{
            throw new ISBNException("Podany number ISBN nie jest prawdilowy");
        }




    }

}
