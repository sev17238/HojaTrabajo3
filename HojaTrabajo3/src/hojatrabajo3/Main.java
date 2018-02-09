
package hojatrabajo3;

/**
 * Clase que instancia objetos de las clases "GeneratorTXT", "LecturaEscritura" y de "Sorts" para que con la lista
 * generada de numeros aleatorios en la primera clase se haga el ordenamiento con los metodos de la segunda.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class Main {
    public static void main(String[] args) {
        
        SelectionSort ss = new SelectionSort();
        GnomeSort gs = new GnomeSort();
        QuickSort qs = new QuickSort();
        RadixSort rs = new RadixSort();
        MergeSort ms = new MergeSort();
        
        Lectura le = new Lectura();
        Comparable[] lista = le.leerArchivo();
        
        Comparable[] listaSS = lista.clone();
        Comparable[] listaGS = lista.clone();
        Comparable[] listaQS = lista.clone();
        Comparable[] listaRS = lista.clone();
        Comparable[] listaMS = lista.clone();
        
        ss.selectionSort(listaSS);
        
        //Sorts sort = new Sorts();
        //GeneratorTXT txt = new GeneratorTXT();
        
        //txt.generarNumero();
        
        
        
        /*
        sort.MergeSort(list);
        sort.QuickSort(list);
        sort.RadixSort(list);
        sort.Otro(list);*/
        
        
        //YA SIRVEN
        //sort.selectionSort(lista);
        //sort.GnomeSort(lista);
        //sort.MergeSort(lista);
        //sort.QuickSort(lista, 0, (int)lista.length-1);
        
        //NO SIRVEN
        //sort.RadixSort(lista);        
        
                
        /*for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }*/
          
        
     
     
    }
}
