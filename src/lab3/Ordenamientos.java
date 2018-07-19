package lab3;

import java.util.Random;

public class Ordenamientos {
    
    Random rnd = new Random();
    static final int CANT_ELEMENTOS = 10;
    int aux = 0, i, j;
    int[] array = new int[CANT_ELEMENTOS];
    
    public void cargarArray(){
        for(i = 0; i < CANT_ELEMENTOS; i++){
            array[i] = (int)(rnd.nextDouble()*100+1);
        }
        for(i = 0; i < CANT_ELEMENTOS; i++){
            System.out.print(" " + array[i]);
        }
    }
    
    public void ordenarPorBurbuja(){
        for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length - 1; j++){
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        } 
    }
    
    public void ordenarPorInsercion(){
        for(i = 1; i < array.length; i++){
            for(j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    aux = array[j];
                    array[j] = array[j-1];
                    array[j-1] = aux;
                }
            }
        }
    }
    
    public void ordenarPorSeleccion(){
        int menor, pos = 0;
        for(i = 0; i < array.length - 1; i++){
            menor = array[i];
            for(j = i + 1; j < array.length; j++){
                if(array[j] < menor){
                    menor = array[j];
                    pos = j;
                }
            }
            aux = array[i];
            array[i] = menor;
            array[pos] = aux;
        }
    }
    
    public void imprimirArrayOrdenado(){
        System.out.println("Array ordenado:");
        for(i = 0; i < CANT_ELEMENTOS; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Ordenamientos prueba = new Ordenamientos();
        prueba.cargarArray();
        System.out.println("");
        prueba.ordenarPorBurbuja();
        System.out.println("*Bubble Sort*");
        prueba.imprimirArrayOrdenado();
        prueba.ordenarPorInsercion();
        System.out.println("*Insertion Sort*");
        prueba.imprimirArrayOrdenado();
        prueba.ordenarPorSeleccion();
        System.out.println("*Selection Sort*");
        prueba.imprimirArrayOrdenado();
    }
    
}
