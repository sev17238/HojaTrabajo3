
package hojatrabajo3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.File;
//import java.io.PrintWriter;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 * Clase que genera un archivo.txt con 3000 numeros aleatorios.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class GeneratorTXT {
        
    
    public void generarNumero(){
        //se declara el objeto para crear el archivo
        FileWriter flwriter = null;
	try {
            //se debe de especificar la ruta en donde se quiere crear el archivo, al igual que su nombre.
            flwriter = new FileWriter("C:\\Users\\SDiego\\Desktop\\fichero\\datos.txt");
            //flwriter = new FileWriter("C:\\Users\\javie\\Documents\\BitBucket\\Estructura de Datos\\HT 3\\HojaTrabajo3\\numeros.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (int i=0;i<=3000;i++) {
                //Se declara un numero aleatorio entre 1 y 3000
                int numero = (int) (Math.random() * 3000) + 1;
                //escribe los datos en el archivo
                String numstr = Integer.toString(numero);
                bfwriter.write(numstr);
                bfwriter.write("\r\n");              
            }
            //se cierra el buffer intermedio
            bfwriter.close();
            System.out.println("Archivo creado!"); 
        } catch (IOException e) {
		e.printStackTrace();
        } finally {
            if (flwriter != null) {
                try {//se cierra el flujo principal
                    flwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}