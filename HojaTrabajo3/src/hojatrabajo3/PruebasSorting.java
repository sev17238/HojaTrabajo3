
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
        GeneradorTXT txt = new GeneradorTXT();
        
        txt.generarNumero();
        Comparable[] lista = le.leerArchivo();
        
        /*
        sort.MergeSort(list);
        sort.QuickSort(list);
        sort.RadixSort(list);
        sort.Otro(list);*/
        
        //sort.selectionSort(lista);
        //sort.GnomeSort(lista);
        sort.QuickSort(lista, 0, lista.length);
                
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
          
        
     
     
    }
}
