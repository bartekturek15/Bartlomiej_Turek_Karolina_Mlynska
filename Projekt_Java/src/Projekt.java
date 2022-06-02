import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Projekt {
    public static void main(String[] args) {
        Użytkownik[] user  = new Użytkownik[5];
        Działania działania = new Działania();
        File plikDane = new File("Użytkownik.txt");


        try {

            Scanner skaner = new Scanner(plikDane);

            while (skaner.hasNextLine()) {
                user[0] = działania.znajdz(skaner.nextLine());
            }
            // Jeśli nie udało się odczytać pliku
        } catch (FileNotFoundException e) {
            System.out.println("Brak Pliku do odczytania!");
        }
        System.out.println(user[0].login);
        System.out.println(user[0].imie);
        System.out.println(user[0].nazwisko);
        System.out.println(user[0].ulica);
        System.out.println(user[0].nrMieszkania);
        System.out.println(user[0].miasto);



        /*Użytkownik user  = new Użytkownik();
        user.login = "Admin";
        user.imie = "Marcin";
        user.nazwisko = "Andrzejczak";
        user.ulica = "Jedynkowa";
        user.nrMieszkania = "1";
        user.miasto = "Jedyniec";

        try {
            PrintWriter out = new PrintWriter("Użytkownik.txt");

            out.println(user.login+";"+user.imie+";"+user.nazwisko+";"+user.ulica+";"+user.nrMieszkania+";"+user.miasto);

            out.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Niestety, nie mogę utworzyć pliku!");
        }*/
    }
}
