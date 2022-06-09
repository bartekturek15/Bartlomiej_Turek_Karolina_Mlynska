public class Auto {
    String id, marka, rocznik, przebieg, cenaWypozyczenia, pojemnoscSilnika, wypozyczone;

    public Auto()
    {

    }
    public Auto(String Id, String Marka, String Rocznik, String Przebieg, String CenaWypozyczenia, String PojemnoscSilnika, String Wypozyczone)
    {
        id = Id;
        marka = Marka;
        rocznik = Rocznik;
        przebieg = Przebieg;
        cenaWypozyczenia = CenaWypozyczenia;
        pojemnoscSilnika = PojemnoscSilnika;
        wypozyczone = Wypozyczone;
    }
    @Override
    public String toString()
    {
        return "\nId: " + id + "\nMarka: " + marka + "\nRocznik: " + rocznik + "\nprzebieg: " + przebieg + "\ncena Wypozyczenia: " + cenaWypozyczenia
                + "\npojemnoscSilnika: " + pojemnoscSilnika;
    }

}

