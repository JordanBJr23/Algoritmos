
package algoritmos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class VentaCar {
    String nombre;
    private HashSet<Auto> listaAutos;

    public VentaCar(String nombre) {
        this.nombre = nombre;
        listaAutos = new HashSet<>();
    }
    
    public void agregarAuto(Auto a){
        listaAutos.add(a);
    }
    
    private double kmTotales(){
        double km = 0;
        for(Auto a : listaAutos){
            km += a.getKm();
        }
        return km;
    }
    public int dameTotalAutos(){
        return listaAutos.size();
    }
    
    public  double promedioKm(){
        return (!listaAutos.isEmpty() ? kmTotales()/dameTotalAutos() : 0);
    }
    private double maxKM(){
        double kmMax = -1;
        for (Auto auto : listaAutos) {
            if (auto.getKm() > kmMax) {
                kmMax = auto.getKm();
                
            }
        }
        return kmMax;
    }
    
    public ArrayList<Auto> mayoresAuto(){
        ArrayList autosMax = new ArrayList<>();
       double kmMax = maxKM();
        for (Auto auto : listaAutos) {
            if (auto.getKm() == kmMax ) {
                autosMax.add(auto);
            }
        }
        return autosMax;
    }
    private double minKM(){
        double kmMin = Integer.MAX_VALUE;
        for (Auto auto : listaAutos) {
            if (auto.getKm() < kmMin) {
                kmMin = auto.getKm();
                
            }
        }
        return kmMin;
    }
    
    public ArrayList<Auto> menoresAuto(){
        ArrayList autosMin = new ArrayList<>();
       double kmMin = minKM();
        for (Auto auto : listaAutos) {
            if (auto.getKm() == kmMin ) {
                autosMin.add(auto);
            }
        }
        return autosMin;
    }
    
    public Auto mayor(){
        Auto autoMax = null;
        double kmMax = -1;
        for (Auto auto : listaAutos) {
            if (auto.getKm() > kmMax) {
                kmMax = auto.getKm();
                autoMax = auto;
            }
        }
        return autoMax;
    }
      public Auto menor(){
        Auto autoMin = null;
        double kmMin = Integer.MAX_VALUE;
        for (Auto auto : listaAutos) {
            if (auto.getKm() < kmMin) {
                kmMin= auto.getKm();
                autoMin = auto;
            }
        }
        return autoMin;
    }
//      
//      public Auto buscarAuto(String ID){
//          Auto a = null;
//          int i = 0;
//          while(i < dameTotalAutos() && !listaAutos.get(i).getPlaca().equals(ID)){
//              System.out.println("Paso por el auto");
//              System.out.println(listaAutos.get(i));
//              i++;
//          }
//          if (i < dameTotalAutos()) {
//              a = listaAutos.get(i);
//          }
//          
//          return a;
//      }
      
      public  Auto itereitor(String ID){
          Auto encontrado = null;
          Iterator<Auto> it = listaAutos.iterator();
          int i = 0;
          while(it.hasNext() &&  encontrado == null){
           Auto a = it.next();
            if (a.getPlaca().equals(ID)) {
              encontrado = a;
          }
              i++;
          }
          
          
          return encontrado;
      }
    
   
}
