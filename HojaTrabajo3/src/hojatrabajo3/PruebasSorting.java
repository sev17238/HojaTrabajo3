
package hojatrabajo3;

/**
 * Clase que instancia un objetos de las clases "LecturaEscritura" y de "Sorts" para que con la lista
 * generada de numero aleatorios en la primera clase se haga el ordenamiento con los metodos de la segunda.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class PruebasSorting {
    public static void main(String[] args) {
        LecturaEscritura le = new LecturaEscritura();
        Sorts sort = new Sorts();
        
        String[] list = le.leerArchivo();
        
        /*
        sort.GnomeSort(list);
        sort.MergeSort(list);
        sort.QuickSort(list);
        sort.RadixSort(list);
        sort.Otro(list);*/
        
                
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
          
        
     
     
    }
}
