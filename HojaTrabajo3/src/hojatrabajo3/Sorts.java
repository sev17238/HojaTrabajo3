
package hojatrabajo3;

/**
 * Clase donde se encuentran los metodos de sorting, cada uno con la capacidad de ordenar valores
 * de menor a mayor, pero con un tiempo de ejecucion diferente.
 * @author Cpn. Javier Garfio
 * @author Diego C-villa
 */
public class Sorts {
    
    
    
    public void GnomeSort(String[] list){
        
    }
    
    public void MergeSort(String[] list){
        
    }
    
    public void QuickSort(String[] list){
        
    }
    
    public void RadixSort(String[] list){
        
    }
    
    public String[] Otro(String[] list){        
        String[] lista = new String[list.length];       
        String str;
        for(int i=0; i<list.length ;i++){
            str = list[i];
            lista[i] = str;
        }
        for(int i = 0;i<lista.length-1;i++){
            for(int j=0;j<lista.length-1;j++){
                if(Integer.parseInt(lista[j]) > Integer.parseInt(lista[j+1])){
                    int temp = Integer.parseInt(lista[j+1]);
                    lista[j+1]=lista[j];
                    lista[j]= Integer.toString(temp);
                }
            }
        }
        return lista;
    }
}
