
package algoritmos;


public class Main {


    public static void main(String[] args) {
        VentaCar AutosLeo = new VentaCar("10000");
        AutosLeo.agregarAuto(new Auto("ABC123","Rojo", 1003));
        AutosLeo.agregarAuto(new Auto("DEF456","Negro", 4000));
        AutosLeo.agregarAuto(new Auto("BCD234","Verde", 2000));
        AutosLeo.agregarAuto(new Auto("DEF458","Blanco", 4000));
        AutosLeo.agregarAuto(new Auto("CDE345","Azul", 3000));
        AutosLeo.agregarAuto(new Auto("DEF457","Gris", 4000));
       
        
//        double promedio = AutosLeo.promedioKm();
//        System.out.println(promedio);
        //System.out.println("El auto con mayor recorrido es: " + AutosLeo.mayor());
        //System.out.println("El auto con menor recorrido es: " + AutosLeo.menor());
       // System.out.println("Autos con mayor km recorridos: " + AutosLeo.mayoresAuto());
        //System.out.println("Autos con menores km recorridos: " + AutosLeo.menoresAuto());
        
        //Busqueda lineal
        
       Auto a = AutosLeo.itereitor("BCD234");
        if (a != null) {
            System.out.println("encontro el " + a);
        }else{
            System.out.println("No existe el auto");
        }
    }
    
}
