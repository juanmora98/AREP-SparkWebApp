package edu.escuelaing.arep.models;

// Clase de la cabeza representativa de una linked list
public class Head<T>
{
    //Atributos
    private Node<T> primerDato;
    private Node<T> ultimoDato;


//region metodo constructor  
    /**
    * Metodo constructor del Head de la linkedlist
    * @param primerDt Nodo a agregar al head que representa la primera posicion de la lista
    * @param ultimoDt Nodo a agregar al head que representa la ultima posicion de la lista
    */
    public Head(Node<T> primerDt, Node<T> ultimoDt){
        this.primerDato = primerDt;
        this.ultimoDato = ultimoDt;
    }
//endregion

/**
 * Metodo encargado de agregar un nodo en la primera posicion del head
 * @param nodo nodo a agregar
 */
    public void AddPrimerDato(Node<T> nodo){
        this.primerDato = nodo;
    }

    /**
     * Metodo encargado de agregar un nodo en la ultima posicion del head y si excite anteriormente un nodo se encadenara a este
     * @param nodo a agregar en la ultima posicion del head
     */
    public void AddUltimoDato(Node<T> nodo){
        if(ultimoDato != null){
            ultimoDato.setSiguienteNodo(nodo);
        }
        this.ultimoDato = nodo;
    }


/**
 * Metodo encargado de entregar el primer dato que esta en el head
 * @return nodo que se encuentra en la primera posicion del head
 */
    public Node<T> getPrimerAtributo(){
        return primerDato;
    }

    /**
     * Metodo encargado de entregar el ultimo dato que esta en el head
     * @return nodo que se encuentra en la ultima posicion del head
     */
    public Node<T> getUltimoAtributo(){
        return ultimoDato;
    }

    /**
     * Metodo encargado de desconectar el head con el nodo de la primera posicion
     */
    public void EliminarConexionCabeza(){
        this.primerDato = null;
    }

    /**
     * Metodo encargado de desconectar el head con el nodo de la ultima posicion
     */
    public void EliminarConexionCola(){
        this.ultimoDato = null;
    }

    /**
     * Metodo encargado de eliminar las conexiones que tenga el head y asi reiniciarlo.
     */
    public void ClearHead(){
        EliminarConexionCabeza();
        EliminarConexionCola();
        System.gc();
        System.runFinalization();
    }

}