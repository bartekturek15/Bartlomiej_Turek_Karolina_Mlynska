import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dzialania {
    public void usuwanieauta(){
        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Auta.txt";


        System.out.println("Podaj ID: ");
        String usun = scanner.nextLine();

        Auto auto = new Auto();

        String tempauta = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempauta);

        try{
            FileWriter fw = new FileWriter(tempauta, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                auto.id = x.next();
                auto.marka = x.next();
                auto.rocznik = x.next();
                auto.przebieg = x.next();
                auto.cenaWypozyczenia = x.next();
                auto.pojemnoscSilnika = x.next();
                auto.wypozyczone = x.next();
                if(!auto.id.equals(usun))
                {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+auto.wypozyczone+";");
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
    public void dodawanieauta() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto();
        FileWriter fw = new FileWriter("Auta.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        System.out.println("Podaj ID: ");
        auto.id = scanner.next();
        System.out.println("Podaj marke: ");
        auto.marka = scanner.next();
        System.out.println("Podaj rocznik: ");
        auto.rocznik = scanner.next();
        System.out.println("Podaj przebieg: ");
        auto.przebieg = scanner.next();
        System.out.println("Podaj cene wypozyczenia: ");
        auto.cenaWypozyczenia = scanner.next();
        System.out.println("Podaj pojemnosc silnika: ");
        auto.pojemnoscSilnika = scanner.next();

        auto.wypozyczone = "Dostepne";

        pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika + "," + auto.wypozyczone + ";");


        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
    public void edytowanieauta(){
        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Auta.txt";

        System.out.println("Podaj ID: ");
        String zmien = scanner.nextLine();

        Auto auto = new Auto();
        Auto auto1 = new Auto();

        System.out.println("Podaj nowe ID: ");
        auto1.id = scanner.next();
        System.out.println("Podaj nowa marke: ");
        auto1.marka = scanner.next();
        System.out.println("Podaj nowy rocznik: ");
        auto1.rocznik = scanner.next();
        System.out.println("Podaj nowy przebieg: ");
        auto1.przebieg = scanner.next();
        System.out.println("Podaj nowa cene wypozyczenia: ");
        auto1.cenaWypozyczenia = scanner.next();
        System.out.println("Podaj nowa pojemnosc silnika: ");
        auto1.pojemnoscSilnika = scanner.next();

        String tempauta = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempauta);

        try{
            FileWriter fw = new FileWriter(tempauta, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                auto.id = x.next();
                auto.marka = x.next();
                auto.rocznik = x.next();
                auto.przebieg = x.next();
                auto.cenaWypozyczenia = x.next();
                auto.pojemnoscSilnika = x.next();
                auto.wypozyczone = x.next();
                if(auto.id.equals(zmien))
                {
                    pw.print(auto1.id + "," + auto1.marka + "," + auto1.rocznik + "," + auto1.przebieg + "," + auto1.cenaWypozyczenia + "," + auto1.pojemnoscSilnika+","+auto.wypozyczone+";");
                }
                else {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+auto.wypozyczone+";");
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
    public void wyswietlanieaut(){

        ArrayList<String> rekordy1 = new ArrayList<String>();
        Scanner x;
        String plik1 = "Auta.txt";


        Auto auto = new Auto();

        try{

            x = new Scanner(new File(plik1));
            x.useDelimiter("[,;]");

            while(x.hasNext()){
                auto.id = x.next();
                auto.marka = x.next();
                auto.rocznik = x.next();
                auto.przebieg = x.next();
                auto.cenaWypozyczenia = x.next();
                auto.pojemnoscSilnika = x.next();
                auto.wypozyczone = x.next();

                String rekord =  auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika + "," + auto.wypozyczone + ";";
                rekordy1.add(rekord);

            }
        }
        catch(Exception e)
        {

        }
        String[] rekordyArray1 = new String[rekordy1.size()];
        rekordy1.toArray(rekordyArray1);
        for(int i = 0; i<rekordy1.size(); i++){
            System.out.println(rekordyArray1[i]);
        }

    }

}
