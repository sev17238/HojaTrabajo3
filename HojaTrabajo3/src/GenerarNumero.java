
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que genera un archivo.txt con 3000 numeros aleatorios.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class GenerarNumero {

    
    public static void main(String[] args) {
        int can = 2700;
        
        //se declara el objeto para crear el archivo
        FileWriter flwriter = null;
	try {
            //se debe de especificar la ruta en donde se quiere crear el archivo, al igual que su nombre.
            //flwriter = new FileWriter("C:\\Users\\SDiego\\Desktop\\fichero\\datos.txt");
            flwriter = new FileWriter("./numeros.txt");
            //crea un buffer o flujo intermedio antes de escribir directamente en el archivo
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            for (int i=0;i<can;i++) {
                //Se declara un numero aleatorio entre 1 y 3000
                int numero = (int) (Math.random() * can) + 1;
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
