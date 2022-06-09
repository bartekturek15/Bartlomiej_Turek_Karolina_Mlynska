import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dzialaniauzyt {
    public void usuwanieuser(){
        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Użytkownik.txt";


        System.out.println("Podaj ID: ");
        String usun = scanner.nextLine();

        Uzytkownik uzytkownik = new Uzytkownik();

        String tempuser = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempuser);

        try{
            FileWriter fw = new FileWriter(tempuser, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                uzytkownik.id = x.next();
                uzytkownik.login = x.next();
                uzytkownik.imie = x.next();
                uzytkownik.nazwisko = x.next();
                uzytkownik.ulica = x.next();
                uzytkownik.nrMieszkania = x.next();
                uzytkownik.miasto = x.next();
                uzytkownik.idauto = x.next();
                if(!uzytkownik.id.equals(usun))
                {
                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania+","+ uzytkownik.miasto+","+uzytkownik.idauto+";");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            File stary = new File(plik);
            stary.delete();
            File m = new File(plik);
            nowyplik.renameTo(m);


        }
        catch(Exception e)
        {

        }
    }
    public void dodawanieuser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Uzytkownik uzytkownik = new Uzytkownik();
        FileWriter fw = new FileWriter("Użytkownik.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        System.out.println("Podaj ID: ");
        uzytkownik.id = scanner.next();
        System.out.println("Podaj login: ");
        uzytkownik.login = scanner.next();
        System.out.println("Podaj imie: ");
        uzytkownik.imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        uzytkownik.nazwisko = scanner.next();
        System.out.println("Podaj ulice: ");
        uzytkownik.ulica = scanner.next();
        System.out.println("Podaj numer mieszkania: ");
        uzytkownik.nrMieszkania = scanner.next();
        System.out.println("Podaj miasto: ");
        uzytkownik.miasto = scanner.next();

        uzytkownik.idauto = "";

        pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania+","+ uzytkownik.miasto+","+uzytkownik.idauto +";");


        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
    public void edytowanieuser(){
        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Użytkownik.txt";

        System.out.println("Podaj ID: ");
        String zmien = scanner.nextLine();

        Uzytkownik uzytkownik = new Uzytkownik();
        Uzytkownik uzytkownik1 = new Uzytkownik();

        System.out.println("Podaj nowe ID: ");
        uzytkownik1.id = scanner.next();
        System.out.println("Podaj nowy login: ");
        uzytkownik1.login = scanner.next();
        System.out.println("Podaj nowe imie: ");
        uzytkownik1.imie = scanner.next();
        System.out.println("Podaj nowe nazwisko: ");
        uzytkownik1.nazwisko = scanner.next();
        System.out.println("Podaj nowa ulice: ");
        uzytkownik1.ulica = scanner.next();
        System.out.println("Podaj nowy numer mieszkania: ");
        uzytkownik1.nrMieszkania = scanner.next();
        System.out.println("Podaj nowe miasto: ");
        uzytkownik1.miasto = scanner.next();

        String tempuser = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempuser);

        try{
            FileWriter fw = new FileWriter(tempuser, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                uzytkownik.id = x.next();
                uzytkownik.login = x.next();
                uzytkownik.imie = x.next();
                uzytkownik.nazwisko = x.next();
                uzytkownik.ulica = x.next();
                uzytkownik.nrMieszkania = x.next();
                uzytkownik.miasto = x.next();
                uzytkownik.idauto = x.next();
                if(uzytkownik.id.equals(zmien))
                {
                    pw.print(uzytkownik1.id + "," + uzytkownik1.login + "," + uzytkownik1.imie + "," + uzytkownik1.nazwisko + "," + uzytkownik1.ulica + "," + uzytkownik1.nrMieszkania+","+ uzytkownik1.miasto+","+uzytkownik.idauto+";");
                }
                else {
                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania+","+ uzytkownik.miasto+","+uzytkownik.idauto+";");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            staryplik.delete();
            File m = new File(plik);
            nowyplik.renameTo(m);


        }
        catch(Exception e)
        {

        }
    }
    public void wyswietlanieuser(){

        ArrayList<String> rekordy = new ArrayList<String>();
        Scanner x;
        String plik = "Użytkownik.txt";
        String total = "\n";

        Uzytkownik uzytkownik = new Uzytkownik();

        try{

            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                uzytkownik.id = x.next();
                uzytkownik.login = x.next();
                uzytkownik.imie = x.next();
                uzytkownik.nazwisko = x.next();
                uzytkownik.ulica = x.next();
                uzytkownik.nrMieszkania = x.next();
                uzytkownik.miasto = x.next();
                uzytkownik.idauto = x.next();

                String rekord =  uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania+","+ uzytkownik.miasto+","+uzytkownik.idauto+";";
                rekordy.add(rekord);

            }
        }
        catch(Exception e)
        {

        }
        String[] rekordyArray = new String[rekordy.size()];
        rekordy.toArray(rekordyArray);
        for(int i = 0; i<rekordy.size(); i++){
            System.out.println(rekordyArray[i]);
        }

    }



}
