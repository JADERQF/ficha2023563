package Colecciones;
import java.util.Iterator;
import java.util.TreeSet;
public class Colecciones {
    
public static void main(String args[]) {

TreeSet ciudades = new TreeSet();
ciudades.add("Cali");
        ciudades.add("Barranquilla");
        ciudades.add("Bogota");
        ciudades.add("Popayan");
        ciudades.add("Medellin");
        ciudades.add("Cali"); // valor repetido

Iterator it = ciudades.iterator();
while(it.hasNext()){
            System.out.println("Ciudad"+"    "+it.next());
}

}
}
/*
HashSet: El conjunto de datos no se almacena en un orden específico, si bien se
garantiza que no hay duplicados.

TreeSet: Los elementos del conjunto se almacenan de menor a mayor.

LinkedHashSet: Los elementos del conjunto se encuentran en el orden que se 
insertan, similar a una lista pero sin dejar ingresar valores repetido.

*/
    