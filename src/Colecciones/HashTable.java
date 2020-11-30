package Colecciones;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
/*1.	Crear un arrayList que contenga el nombre de la ciudad
Debe ser ingresado por teclado

2.	Crear un Hashtable que contenga el nombre de la ciudad con su departamento
            Debe ser ingresado por teclado
 */
public class HashTable {
    
    public static void main(String []args)
    {
        ArrayList<String> ciudades = new ArrayList<>();
        Hashtable <String, String> contenedor = new Hashtable<String, String>();
        Scanner sc = new Scanner(System.in);
        String ciudad, departamento;
        int opcion;
        do{            
            System.out.println("Digite el nombre de una ciudad: ");
            ciudad = sc.nextLine();
            System.out.println("Digite el nombre del departamento de la ciudad: ");
            departamento = sc.nextLine();
            ciudades.add(ciudad);
            contenedor.put(ciudad, departamento);
            System.out.println("¿Desea ingresar otra ciudad? \n[1] SI \n[2] NO");
            opcion = sc.nextInt();
            sc.nextLine(); //Limpia el objeto Scanner.
        
        }while(opcion == 1);
        mostrarHash(contenedor);//Método para mostrar los datos del hashtable.
    }    
    public static void mostrarHash(Hashtable contenedor)
    {
        Enumeration enumeration = contenedor.elements(); //Obtiene el valor del hashtable.
        Enumeration llaves  = contenedor.keys(); //Obtiene las llaves del hashtable.
        while (enumeration.hasMoreElements() && llaves.hasMoreElements()) 
        { //Comprueba si esta enumeración contiene más elementos.
         System.out.println(enumeration.nextElement()+"< -------->"+llaves.nextElement());
        // nextElement()--> Devuelve el siguiente elemento de esta
        //enumeración si este objeto de enumeración tiene al menos un elemento más para proporcionar.
        }
    }   
}
