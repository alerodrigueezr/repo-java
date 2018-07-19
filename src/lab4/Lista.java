
package lab4;

public class Lista {
    
    private Nodo inicio;
    private int tamanio;

    public Lista() {
        inicio = null;
        tamanio = 0;
    }
    public boolean esVacia(){
        return inicio == null;
    }
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
    
    public void agregarAlInicio(){
        Nodo nuevo = new Nodo();
        
        
    }
    public void borrarAlPrincipio(){
        
    }
    public void borrarAlFinal(){
        
    }
    public void mostrarLista(){
        
    }
    public void borrarLista(){
        
    }
   
}
