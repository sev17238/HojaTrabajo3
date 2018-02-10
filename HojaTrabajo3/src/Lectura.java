

import java.io.*;
import java.util.Scanner;
/**
 * Clase que permite la lectura de un fichero .txt guardandola en un array Comparable[]..
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class Lectura {
    private Comparable[] lista;
    
    public Lectura(){
        lista = new Comparable[3000]; //aqui debe ser 3001 porque sino sale index out of bounds
    }
    
    	/**
         * Metodo que returna el arreglo con los 3000 numero generados por el programa GeneradorTXT.
         * @return el arreglo con los 3000 numeros
         */
	public Comparable[] leerArchivo() {
            // crea el flujo para leer desde el archivo
            //File file = new File("C:\\Users\\SDiego\\Desktop\\fichero\\datos.txt");
            File file = new File("./numeros.txt");
            Scanner scanner;
            try {
                int i =0;   
                //se pasa el flujo al objeto scanner

                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    // el objeto scanner lee linea a linea desde el archivo

                    String linea = scanner.nextLine();
                    lista[i] = Integer.parseInt(linea);
                    i = i+1;
                }
                //se cierra el scanner

                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return lista;
        }
        
    public void imprimirLista(Comparable[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
