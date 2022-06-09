import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Projekt {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Dzialania dzial = new Dzialania();
        Dzialaniauzyt dzial1 = new Dzialaniauzyt();
        //dzial1.dodawanieuser();
        //dzial.wyswietlanieaut();
        //dzial.edytowanieauta();
        //dzial.dodawanieauta();
        //dzial.usuwanieauta();
        weryfikacjalogowania();
        //wypozycz();
        //odwypozycz();
        System.out.println(Login);
        }

        public static String Login = "";
        public static boolean zalogowany;
        public static void weryfikacjalogowania(){


            Uzytkownik uzytkownik = new Uzytkownik();
            zalogowany = false;
            Scanner scanner = new Scanner(System.in);
            Scanner x;
            String plik = "Użytkownik.txt";

            try{

                System.out.println("Podaj login: ");
                String login = scanner.nextLine();
                Login = login;


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
                    if(uzytkownik.login.equals(login))
                    {
                        zalogowany = true;
                        if(login.equals("admin")){
                            adminmenu();
                        }
                        else{
                            usermenu();
                        }
                    }

                }
                if(zalogowany == false)
                {
                    System.out.println("Nie ma takiego loginu");
                }
                x.close();


            }
            catch(Exception e)
            {

            }
        }
        public static void wyloguj() {
            Login = "";
            zalogowany = false;
            weryfikacjalogowania();


        }
        public static void adminmenu() throws IOException {

            Dzialania dzial = new Dzialania();
            Dzialaniauzyt dzial1 = new Dzialaniauzyt();

            Scanner scan = new Scanner(System.in);
            int wybor = 0;
            while (wybor != 3) {
                System.out.println("1. Operacje na uzytkownikach");
                System.out.println("2. Operacje na autach");
                System.out.println("3.Wyloguj");

                System.out.println("Wybierz: ");
                wybor = scan.nextInt();


                switch (wybor) {
                    case 1:

                        System.out.println("1. Dodaj uzytkownika");
                        System.out.println("2. Usun uzytkownika");
                        System.out.println("3. Edytuj uzytkownika");
                        System.out.println("4. Wyświetl wszystkich uzytkownikow");
                        System.out.println("Wybierz: ");
                        int wybor1 = scan.nextInt();
                        switch (wybor1){
                            case 1:
                                dzial1.wyswietlanieuser();
                                dzial1.dodawanieuser();

                                break;
                            case 2:
                                dzial1.wyswietlanieuser();
                                dzial1.usuwanieuser();

                                break;
                            case 3:
                                dzial1.wyswietlanieuser();
                                dzial1.edytowanieuser();

                                break;
                            case 4:
                                dzial1.wyswietlanieuser();

                                break;
                            default: System.out.println("Nie ma takiej opcji");
                        }

                        break;
                    case 2:

                        System.out.println("1. Dodaj auto");
                        System.out.println("2. Usun auto");
                        System.out.println("3. Edytuj auto");
                        System.out.println("4. Wyswietl wszystkie auta");
                        System.out.println("Wybierz: ");
                        int wybor2 = scan.nextInt();
                        switch (wybor2){
                            case 1:
                                dzial.wyswietlanieaut();
                                dzial.dodawanieauta();

                                break;
                            case 2:
                                dzial.wyswietlanieaut();
                                dzial.usuwanieauta();

                                break;
                            case 3:
                                dzial.wyswietlanieaut();
                                dzial.edytowanieauta();

                                break;
                            case 4:
                                dzial.wyswietlanieaut();


                                break;
                            default: System.out.println("Nie ma takiej opcji");
                        }



                        break;
                    case 3:
                        wyloguj();

                        break;
                    default: System.out.println("Nie ma takiej opcji");
                }
            }
        }
        public static void usermenu()
        {
            Dzialania dzial = new Dzialania();

            Scanner scan = new Scanner(System.in);
            int wybor = 0;

            while (wybor != 5) {
                System.out.println("1. Wyswietl liste aut");
                System.out.println("2. Wyswietl szczegoly o uzytkowniku");
                System.out.println("3. Wypozycz auto");
                System.out.println("4. Oddaj auto");
                System.out.println("5. Wyloguj sie");

                System.out.println("Wybierz: ");
                wybor = scan.nextInt();


                switch(wybor){
                    case 1:
                        dzial.wyswietlanieaut();

                        break;
                    case 2:
                        wyswietlanieuserszcz();

                        break;
                    case 3:
                        wypozycz();

                        break;
                    case 4:
                       odwypozycz();

                        break;
                    case 5:
                        wyloguj();

                        break;
                    default: System.out.println("Nie ma takiego loginu");
                }
        }
    }
    public static void wypozycz() {

        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Użytkownik.txt";

        System.out.println("Podaj ID samochodu: ");
        String id = scanner.nextLine();

        Uzytkownik uzytkownik = new Uzytkownik();

        String tempuser = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempuser);

        try {
            FileWriter fw = new FileWriter(tempuser, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");

            while (x.hasNext()) {
                uzytkownik.id = x.next();
                uzytkownik.login = x.next();
                uzytkownik.imie = x.next();
                uzytkownik.nazwisko = x.next();
                uzytkownik.ulica = x.next();
                uzytkownik.nrMieszkania = x.next();
                uzytkownik.miasto = x.next();
                uzytkownik.idauto = x.next();
                if (uzytkownik.login.equals(Login)) {
                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania + "," + uzytkownik.miasto + "," + id + ";");
                } else {

                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania + "," + uzytkownik.miasto + "," + uzytkownik.idauto + ";");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            staryplik.delete();
            File m = new File(plik);
            nowyplik.renameTo(m);


        } catch (Exception e) {

        }

        Scanner x1;
        String plik1 = "Auta.txt";
        Auto auto = new Auto();

        String tempauta = "temp.txt";
        File staryplik1 = new File(plik1);
        File nowyplik1 = new File(tempauta);

        try{
            FileWriter fw = new FileWriter(tempauta, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x1 = new Scanner(new File(plik1));
            x1.useDelimiter("[,;]");

            while(x1.hasNext()){
                auto.id = x1.next();
                auto.marka = x1.next();
                auto.rocznik = x1.next();
                auto.przebieg = x1.next();
                auto.cenaWypozyczenia = x1.next();
                auto.pojemnoscSilnika = x1.next();
                auto.wypozyczone = x1.next();
                if(auto.id.equals(id))
                {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+"wyp"+";");
                }
                else {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+auto.wypozyczone+";");
                }
            }
            x1.close();
            pw.flush();
            pw.close();
            staryplik1.delete();
            File m = new File(plik1);
            nowyplik1.renameTo(m);


        }
        catch(Exception e)
        {

        }
    }
    public static void odwypozycz() {

        Scanner scanner = new Scanner(System.in);
        Scanner x;
        String plik = "Użytkownik.txt";


        Uzytkownik uzytkownik = new Uzytkownik();

        String tempuser = "temp.txt";
        File staryplik = new File(plik);
        File nowyplik = new File(tempuser);
        String a = "";

        try {
            FileWriter fw = new FileWriter(tempuser, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(plik));
            x.useDelimiter("[,;]");


            while (x.hasNext()) {
                uzytkownik.id = x.next();
                uzytkownik.login = x.next();
                uzytkownik.imie = x.next();
                uzytkownik.nazwisko = x.next();
                uzytkownik.ulica = x.next();
                uzytkownik.nrMieszkania = x.next();
                uzytkownik.miasto = x.next();
                uzytkownik.idauto = x.next();
                if (uzytkownik.login.equals(Login)) {
                    a = uzytkownik.idauto;
                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania + "," + uzytkownik.miasto + "," + "" + ";");
                } else {

                    pw.print(uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania + "," + uzytkownik.miasto + "," + uzytkownik.idauto + ";");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            staryplik.delete();
            File m = new File(plik);
            nowyplik.renameTo(m);


        } catch (Exception e) {

        }

        Scanner x1;
        String plik1 = "Auta.txt";
        Auto auto = new Auto();

        String tempauta = "temp.txt";
        File staryplik1 = new File(plik1);
        File nowyplik1 = new File(tempauta);

        try{
            FileWriter fw = new FileWriter(tempauta, true);
            BufferedWriter bw = new BufferedWriter(fw );
            PrintWriter pw = new PrintWriter(bw);
            x1 = new Scanner(new File(plik1));
            x1.useDelimiter("[,;]");

            while(x1.hasNext()){
                auto.id = x1.next();
                auto.marka = x1.next();
                auto.rocznik = x1.next();
                auto.przebieg = x1.next();
                auto.cenaWypozyczenia = x1.next();
                auto.pojemnoscSilnika = x1.next();
                auto.wypozyczone = x1.next();
                if(auto.id.equals(a))
                {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+"dostepne"+";");
                }
                else {
                    pw.print(auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika+","+auto.wypozyczone+";");
                }
            }
            x1.close();
            pw.flush();
            pw.close();
            staryplik1.delete();
            File m = new File(plik1);
            nowyplik1.renameTo(m);


        }
        catch(Exception e)
        {

        }
    }
    public static void wyswietlanieuserszcz(){

        ArrayList<String> rekordy = new ArrayList<String>();
        Scanner x;
        String plik = "Użytkownik.txt";


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

                if(uzytkownik.login.equals(Login))
                {
                    String rekord =  uzytkownik.id + "," + uzytkownik.login + "," + uzytkownik.imie + "," + uzytkownik.nazwisko + "," + uzytkownik.ulica + "," + uzytkownik.nrMieszkania+","+ uzytkownik.miasto+";";
                    rekordy.add(rekord);

                    ArrayList<String> rekordy1 = new ArrayList<String>();
                    Scanner x1;
                    String plik1 = "Auta.txt";


                    Auto auto = new Auto();

                    try{

                        x1 = new Scanner(new File(plik1));
                        x1.useDelimiter("[,;]");

                        while(x1.hasNext()){
                            auto.id = x1.next();
                            auto.marka = x1.next();
                            auto.rocznik = x1.next();
                            auto.przebieg = x1.next();
                            auto.cenaWypozyczenia = x1.next();
                            auto.pojemnoscSilnika = x1.next();
                            auto.wypozyczone = x1.next();

                            if(uzytkownik.idauto.equals(auto.id))
                            {
                                System.out.println("Wypożyczony samochód: ");
                                String rekord1 =  auto.id + "," + auto.marka + "," + auto.rocznik + "," + auto.przebieg + "," + auto.cenaWypozyczenia + "," + auto.pojemnoscSilnika + "," + auto.wypozyczone + ";";
                                rekordy1.add(rekord1);
                            }


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


