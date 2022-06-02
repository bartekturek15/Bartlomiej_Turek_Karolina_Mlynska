public class Działania {
    public Użytkownik znajdz(String snax)
    {
        String[] snax1 = new String[6];
        int temp = 0;
        int miejsce = 0;
        for(int i = 0;i<snax.length();i++)
        {
            if(snax.charAt(i)==' ')
            {
                snax1[temp] = snax.substring(miejsce, i);
                temp++;
                miejsce = i+1;
            }
        }
        Użytkownik user = new Użytkownik();
        user.login = snax1[0];
        user.imie = snax1[1];
        user.nazwisko = snax1[2];
        user.ulica = snax1[3];
        user.nrMieszkania = snax1[4];
        user.miasto = snax1[5];
        return user;
    }
}
