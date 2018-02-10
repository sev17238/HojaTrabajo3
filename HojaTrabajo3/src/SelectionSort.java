

/**
 * Clase que implementa el metodo de ordenamiento de seleccion.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class SelectionSort {
    public Comparable[] selectionSort (Comparable[] list){
        
        int min;
        Comparable temp;
        
        for (int index = 0; index < list.length-1; index++){
            min = index;
            for (int scan = index+1; scan < list.length; scan++){
                if (list[scan].compareTo(list[min]) < 0){
                    min = scan;
                }
            }
            
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
        
        return list;
   }
}
