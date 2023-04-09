
package algoritmos;

public class Auto {
    private String placa;
    private String color;
    private double km;

    public Auto(String placa,String color ,double km) {
        this.placa = placa;
        this.color = color;
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public double getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", color=" + color + ", km=" + km + '}';
    }

    
    
    
}
