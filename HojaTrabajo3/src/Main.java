


/**
 * Clase que instancia objetos de las clases "GeneratorTXT", "LecturaEscritura" y de "Sorts" para que con la lista
 * generada de numeros aleatorios en la primera clase se haga el ordenamiento con los metodos de la segunda.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
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
        //le.imprimirLista(lista);
        
        //SELECTION SORT
        Comparable[] listaSS = lista.clone();
        listaSS = ss.selectionSort(listaSS);
        System.out.println("Listo SELECTION SORT");
        
        //GNOME SORT
        Comparable[] listaGS = lista.clone();
        listaGS = gs.GnomeSort(listaGS);
        System.out.println("Listo GNOME SORT");
        
        //QUICK SORT
        Comparable[] listaQS = lista.clone();
        listaQS = qs.QuickSort(listaQS, 0, listaQS.length-1);
        System.out.println("Listo QUICK SORT");
        
        //MERGESORT
        Comparable[] listaMS = lista.clone();
        listaMS = ms.MergeSort(listaMS);
        System.out.println("Listo MERGE SORT");
        
        //RADIX SORT
        Comparable[] listaRS = lista.clone();
        listaRS = rs.radixsort(listaRS,listaRS.length);
        System.out.println("Listo RADIX SORT");
        
        //IMPRIMIR
        /*le.imprimirLista(listaSS);
        le.imprimirLista(listaGS);
        le.imprimirLista(listaQS);   
        le.imprimirLista(listaRS);   
        le.imprimirLista(listaMS);*/
    }
}
