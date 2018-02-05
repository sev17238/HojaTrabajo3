
package hojatrabajo3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class HojaTrabajo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hola = 0;
        
        String ruta = "C:\\Users\\javie\\Documents\\BitBucket\\Estructura de Datos\\HT 3\\HojaTrabajo3\\numeros.txt";
        File archivo = new File(ruta);
        BufferedWriter buffer = null;
        
        if(archivo.exists()) {
            try {
                System.out.println("si");
                buffer = new BufferedWriter(new FileWriter(archivo));
                buffer.write("holaaaa cvilla\nhola jose");
                PrintWriter writer = new PrintWriter(buffer);
                writer.append(" - y aqui continua");
            } catch (IOException ex) {
                Logger.getLogger(HojaTrabajo3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
              System.out.println("no");
        }
        try {
            buffer.close();
        } catch (IOException ex) {
            Logger.getLogger(HojaTrabajo3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
