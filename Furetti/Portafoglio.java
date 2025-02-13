public class Portafoglio extends Portamonete {
    private int banconota5;
    private int banconota10;
    private int banconota20;

    public Portafoglio(double moneta05, double moneta1, double moneta2, int banconota5, int banconota10, int banconota20) {
        super(moneta05, moneta1, moneta2);
        this.banconota5 = banconota5;
        this.banconota10 = banconota10;
        this.banconota20 = banconota20;
    }

    public int getBanconota5() {
        return banconota5;
    }

    public int getBanconota10() {
        return banconota10;
    }

    public int getBanconota20() {
        return banconota20;
    }

    public void aggiungiBanconota5(int numero) {
        banconota5 += numero;
    }

    public void aggiungiBanconota10(int numero) {
        banconota10 += numero;
    }

    public void aggiungiBanconota20(int numero) {
        banconota20 += numero;
    }

    @Override
    public String denaro() {
        double denaroMonete = (getMoneta05() * 0.5) + (getMoneta1() * 1) + (getMoneta2() * 2);
        double denaroBanconote = (banconota5 * 5) + (banconota10 * 10) + (banconota20 * 20);
        double totale = denaroMonete + denaroBanconote;
        return String.format("%.2f", totale);
    }

    public String denaroPerTipo() {
        return String.format("Monete da 50 cent: "+getMoneta05()+ " Monete da 1 euro: "+getMoneta1()+ " Monete da 2 euro: "+getMoneta2()+ " Banconote da 5 euro: "+banconota5+ " Banconote da 10 euro: "+banconota10+ " Banconote da 20 euro: "+banconota20);
    }
}