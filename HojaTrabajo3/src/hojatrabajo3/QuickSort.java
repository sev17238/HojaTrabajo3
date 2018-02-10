
package hojatrabajo3;

/**
 * Clase que implementa el metodo de ordenamiento rapido.
 * @author Cpn. Javier Garfio 17077
 * @author Diego C-villa 17238
 */
public class QuickSort {
    public Comparable[] QuickSort(Comparable[] list, int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        
        int pivot = (int)list[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
            
            while ((int)list[i] < pivot) {
                i++;
            }
            while ((int)list[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(list, i, j);
                
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            QuickSort(list, lowerIndex, j);
        if (i < higherIndex)
            QuickSort(list, i, higherIndex);
        
        return list;
    }
 
    private void exchangeNumbers(Comparable[] list, int i, int j) {
        int temp = (int)list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
