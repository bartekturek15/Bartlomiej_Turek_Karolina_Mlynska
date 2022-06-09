public class Uzytkownik {
    String id,login,imie,nazwisko,ulica,nrMieszkania,miasto,idauto;

    public Uzytkownik()
    {

    }
    public Uzytkownik(String Id, String Login, String Imie, String Nazwisko, String Ulica, String NrMieszkania, String Miasto, String Idauto)
    {
        Id = id;
        Login = login;
        Imie = imie;
        Nazwisko = nazwisko;
        Ulica = ulica;
        NrMieszkania = nrMieszkania;
        Miasto = miasto;
        idauto = Idauto;
    }
    @Override
    public String toString()
    {
        return "\nId: " + id + "\nLogin: " + login + "\nimie: " + imie + "\nNazwisko: " + nazwisko + "\nUlica: " + ulica
                + "\nNrMieszkania: " + nrMieszkania + "\nMiasto: " + miasto;
    }
}
