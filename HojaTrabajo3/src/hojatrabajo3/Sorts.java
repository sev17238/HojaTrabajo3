
package hojatrabajo3;

/**
 * Clase donde se encuentran los metodos de sorting, cada uno con la capacidad de ordenar valores
 * de menor a mayor, pero con un tiempo de ejecucion diferente.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class Sorts {
    
    
    /**
     * 
     * @param list
     * @return 
     */
    public Comparable[] GnomeSort(Comparable[] list){        
        int index=1; //start of search
        int temp;
        for(index = 1; index<list.length;){ //until the array is fully sorted
            if((int)list[index] < (int)list[index-1]){ //compares list[index] with list[index-1]. if smaller, switch.
                temp = (int)list[index];
                list[index]=list[index-1];
                list[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
                if(index==0){ //prevents index from going lower than 1
	          index=1;
	        }
	    }
	      else{
	        index++; //if sorted, go up
	      }
	}        
        return list;
    }
    
    /**
     * El método MergeSort es un algoritmo de ordenación recursivo con un número de comparaciones 
     * entre elementos del array mínimo,
     * De forma resumida el funcionamiento del método MergeSort es el siguiente:
        - Si la longitud del array es menor o igual a 1 entonces ya está ordenado
        - El array a ordenar se divide en dos mitades de tamaño similar
        - Cada mitad se ordena de forma recursiva aplicando el método MergeSort
        - A continuación las dos mitades ya ordenadas se mezclan formando una secuencia ordenada. 
     * @param a 
     * @return  
     */
    public Comparable[] MergeSort(Comparable [ ] a){
	Comparable[] tmp = new Comparable[a.length];
	mergeSort(a, tmp,  0,  a.length - 1);
        return a;
    }
    private void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right){
	if( left < right ){
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
	}
    }
    private void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];
        
        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    
    public void QuickSort(Comparable[] list, int izquierda, int derecha){
        int pivote = (int)list[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while ((int)list[i] <= pivote && i < j) {
                i++;
            }
            while ((int)list[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = (int)list[i];
                list[i] = list[j];
                list[j] = auxIntercambio;
            }
        }
        list[izquierda] = list[j];
        list[j] = pivote;
        if (izquierda < j - 1) {
            QuickSort(list, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(list, j + 1, derecha);
        }
    }
    
        public int[] Radixsort( int[] a){
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0){
            int[] bucket = new int[10];
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;     
        }
        return a;
        
    }    

    
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
                    // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
        
        return list;
   }
}
