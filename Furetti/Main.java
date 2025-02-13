public class Main {
    public static void main(String[] args) {
        Portafoglio mioPortafoglio = new Portafoglio(2, 5, 3, 4, 2, 1);
        
        mioPortafoglio.aggiungi05();
        mioPortafoglio.aggiungi1();
        
        mioPortafoglio.aggiungiBanconota5(2);
        mioPortafoglio.aggiungiBanconota10(1);
        
        System.out.println("Totale denaro nel portafoglio: " + mioPortafoglio.denaro() + " euro");
        
        System.out.println(mioPortafoglio.denaroPerTipo());
    }
}