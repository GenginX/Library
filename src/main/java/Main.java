import java.util.Scanner;

public class Main {
    private static Scanner s;

    public static void main(String[] args) {

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
                    System.out.println("[" + view + "] jeszcze nie zaimplementowana/e");
                    break;
                case 2:
                    System.out.println("[" + add + "] jeszcze nie zaimplementowana/e");
                    break;
                case 3:
                    System.out.println("[" + remove + "] jeszcze nie zaimplementowana/e");
                    break;
                default:
                    System.out.println("Zly wybor");
                    break;
            }

            System.out.println();
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

}

