public class Karta {
    public int wartosc;
    public int kolor;
    public boolean znacznik = true;

    public Karta(int wartosc, int kolor) {
        this.wartosc = wartosc;
        this.kolor = kolor;
        if (wartosc==14)znacznik=false;
    }
}
