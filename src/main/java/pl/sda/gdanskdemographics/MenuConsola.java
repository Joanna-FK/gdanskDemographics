package pl.sda.gdanskdemographics;

import java.util.Scanner;

public class MenuConsola {

    public static void main(String[] args) {
        menu();
    }
    public static void menu (){
        Scanner options  = new Scanner(System.in );
        toMenu();
        int numberOfOptions = options.nextInt();
        if (numberOfOptions >4 || numberOfOptions<0 ) {
            System.out.println("Wybrałeś niewłaściwą opcję, powrót do menu" );
            menu();
        }
        switch( numberOfOptions ) {
            case 1 : optionsOne();
                break;
            case 2 : optionsTwo();
                break;
            case 3: optionsThree();
                break;
            case 4: end();
        }
    }
    static void optionsOne() {
        System.out.println( "Wybrano opcję pierwszą" );
    }
    static void optionsTwo() {
        System.out.println( "Wybrano opcję drugą" );
    }
    static void optionsThree (){
    System.out.println("Wybrano opcję trzecią");
    }
    static void end(){
        System.out.println("Koniec działania programu");
    }
    static void toMenu() {
        System.out.print( "Wybierz opcję wyszukiwania:\n1. Pierwsza\n2. Druga\n3. Trzecia\n4. Wyjście z programu\n>> " );
    }
}
