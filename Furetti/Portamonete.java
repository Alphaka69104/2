public class Portamonete {
    private double moneta05;
    private double moneta1;
    private double moneta2;

    public Portamonete(double moneta05, double moneta1, double moneta2) {
        this.moneta05 = moneta05;
        this.moneta1 = moneta1;
        this.moneta2 = moneta2;
    }

    public Portamonete() {
        this.moneta05 = 0;
        this.moneta1 = 0;
        this.moneta2 = 0;
    }

    public double getMoneta05() {
        return moneta05;
    }

    public double getMoneta1() {
        return moneta1;
    }

    public double getMoneta2() {
        return moneta2;
    }

    public void aggiungi05() {
        moneta05++;
    }

    public void aggiungi1() {
        moneta1++;
    }

    public void aggiungi2() {
        moneta2++;
    }

    public void aggiungiMonete(int numero, double valore) {
        if (valore == 0.5 || valore == 1 || valore == 2) {
            if (valore == 0.5) {
                moneta05 += numero;
            } else if (valore == 1) {
                moneta1 += numero;
            } else if (valore == 2) {
                moneta2 += numero;
            }
        } else {
            System.out.println("Valore delle monete non valido.");
        }
    }

    public String denaro() {
        double den = (moneta05 * 0.5) + (moneta1 * 1) + (moneta2 * 2);
        return String.format("%.2f", den); 
    }

    public String denaroPerTipo() {
        return String.format("Monete da 50 cent: " +moneta05+ " Monete da 1 euro: "+moneta1+ " Monete da 2 euro: "+moneta2);
    }
}