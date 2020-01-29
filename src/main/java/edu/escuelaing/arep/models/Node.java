package edu.escuelaing.arep.models;

// Clase de la cabeza representativa de una linked list
public class Node<T>
{

    //Atributos
    private T dato;
    private Node<T> siguienteNodo;


    /**
     * Metodo constructor de la clase Node
     * @param dato valor a agregar en el nodo
     * @param siguienteNodo conexion que tiene con otro nodo
     */
    public Node(T dato, Node<T> siguienteNodo){
        this.dato = dato;
        this.siguienteNodo = siguienteNodo;
    }

    /**
     * Metodo encargado de cambiar el nodo que sigue al actual por otro
     * @param nodo nodo que va despues del actual y va conectado a este
     */
    public void setSiguienteNodo(Node<T> nodo){
        this.siguienteNodo = nodo;
    }
    
    /**
     * Metodo encargado de entregar el dato guardado en el nodo
     * @return dato que esta en el Nodo
     */
    public T getDato(){
        return dato;
    }

    /**
     * Metodo encargado de entregar el nodo que sigue a este nodo
     * @return nodo conectado a este nodo.
     */
    public Node<T> getSiguienteNodo(){
        return siguienteNodo;
    }

    

}