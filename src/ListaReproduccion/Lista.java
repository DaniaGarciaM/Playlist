/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaReproduccion;

/**
 *
 * @author dania
 */
public class Lista<T> {
    private Nodo head; //Apuntador a la cabecera de la lista(primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (último nodo)
    private Nodo actual;
    private  int size;//Tamaño de la lista(número de nodos en la lista)
    
    public Lista(){
        this. head=null;
        this.actual=null;
        this.tail=null;
        this.size=0;
    }
    
    public void add(T objeto){
        Nodo nuevoNodo = new Nodo(objeto);
        this.size++;
        this.tail = nuevoNodo; //se mueve el apuntador al último nodo
        if(head==null){//La lista está vacía, creamos el nodo
            head = nuevoNodo;
            actual = head;
        }else{
            actual.setSiguiente(nuevoNodo); //actual.sig apunta al nuevoNodo (enlace entre nodos)
            actual = nuevoNodo;//Ahora actual es el nuevo nodo
        }
    }
    
     public void add(T objeto, int posicion){
        Nodo nuevoNodo = new Nodo(objeto);
        int i = 1;
        actual = head;
        while (i<posicion - 1){
            actual = actual.getSiguiente();
            i++;
        }
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    public void printList(){
        int posicion = 1;
        actual = head;
        while (actual != null){
            T elemento =(T) actual.getObjeto();
            System.out.println("Cancion= " + elemento + " almacenada en nodo: " + posicion);
            actual = actual.getSiguiente();//obtiene dirección del siguiente nodo para que se pueda mover
            posicion++;
        }
    }
    
}