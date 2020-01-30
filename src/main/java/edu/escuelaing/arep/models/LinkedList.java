package edu.escuelaing.arep.models;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Clase de una linkedlist
public class LinkedList<T> implements List<T>,Iterable<T> {

    // Atributos
    private Head<T> head;
    private int size;

    // region Metodo constructor de la linkedList
    public LinkedList() {
        head = new Head<T>(null, null);
        size = 0;
    }
// endregion

// region metodo add recibiendo el dato a agregar
    /** 
     * Metodo encargado de agregar un nuevo dato a la linked list, se creara un Nodo
     * con el dato dado, si la lista esta vacia se agregara el nodo a la head como
     * punto inicial y como punto final, si la lista ya tiene uno o mas datos, se
     * agregara el nodo a la conexion del ultimo nodo en el head y luego se
     * remplazara en el head.
     * 
     * @param e dato a agregar
     * 
     * @return true al completar el proceso
     * 
     */
    public boolean add(T e) {
        Node<T> nodo = new Node<T>(e, null);
        if (size == 0) {
            this.head.AddPrimerDato(nodo);
            this.head.AddUltimoDato(nodo);
        } else {
            this.head.AddUltimoDato(nodo);
        }
        size++;
        return true;
    }
// endregion

// region metodo add recibiendo la posicion y el elemento que se quiere agregar
    /**
     * Metodo encargado de agregar un nuevo elemento en una posicion especifica. 
     *
     * Se crea un nuevo nodo con el dato. Si la lista tiene un tamaño menor a la
     * posicion que el dato intenta agregarse no se ara ningun proceso y se mostrara
     * un mensaje donde se dira que fallo el proceso.
     * 
     * @param index posicion a agregar el dato
     * 
     * @param element dato que se quiere agregar a la lista
     */
    public void add(int index, T element) {
        try{
            if (index >= size) {
                throw new IndexOutOfBoundsException("La posicion buscada es mayor al tamaño de la lista");
            }
            Node<T> nuevoNodo = new Node<T>(element, null);
            if (index == 0) {
                nuevoNodo.setSiguienteNodo(head.getPrimerAtributo());
                head.AddPrimerDato(nuevoNodo);
            } else {
                int count = 1;
                Node<T> anteriorNodo = head.getPrimerAtributo();
                Node<T> actualNodo = anteriorNodo.getSiguienteNodo();
                while (count != index) {
                    anteriorNodo = actualNodo;
                    actualNodo = actualNodo.getSiguienteNodo();
                    count++;
                }
                anteriorNodo.setSiguienteNodo(nuevoNodo);
                nuevoNodo.setSiguienteNodo(actualNodo);
            }
            size++;
        }catch(IndexOutOfBoundsException e){
            throw e;
        }
        

    }
    // endregion

// region metodo addAll el cual recibe una coleccion de datos

    /**
     * Metodo encargado de agregar toda una coleccion de datos en la linkedlist.
     * 
     * @param c coleccion de datos a agregar
     * 
     * @return boolean si el proceso se completo adecuadamente
     */
    public boolean addAll(Collection<? extends T> c) {
        for (T b : c) {
            Node<T> nodoAgregar = new Node<T>(b, null);
            if(size == 0){
                head.AddPrimerDato(nodoAgregar);
                head.AddUltimoDato(nodoAgregar);
            }
            else{
                head.getUltimoAtributo().setSiguienteNodo(nodoAgregar);
                head.AddUltimoDato(nodoAgregar);
            }            
            size++;
        }

        return true;
    }
    // endregion

    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        return false;
    }

// region metodo clear que se encargara de limpiar la linkedlist
    /**
     * Metodo encargado de limpiar la lista, realizando la desconexion de la cabeza
     * con los nodos.
     */
    public void clear() {
        head.ClearHead();
        size = 0;
    }
    // endregion

    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

// region metodo get con posicion especificada
    /**
     * Metodo el cual se encarga de encontrar un dato en una posicion especifica
     * solicitada
     * 
     * @param index posicion a buscar en la lista.
     * @return T dato de la solicitud.
     * @throws IndexOutOfBoundsException si la posicion en la lista es mayor al tamaño.
     */
    public T get(int index) {
        T datoRetornar = null;
        try {
            if (index >= size) {
                throw new IndexOutOfBoundsException("La posicion buscada es mayor al tamaño de la lista");
            }
            Node<T> nodoBuscado = head.getPrimerAtributo();
            int cont = 0;
            while(cont != index){
                nodoBuscado = nodoBuscado.getSiguienteNodo();
                cont ++;
            }
            datoRetornar = nodoBuscado.getDato();                       
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
        return datoRetornar;
        
    }
//endregion

    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

//region metodo encargado de decir si la lista esta vacia o no
    /**
    *Metodo encargado de decir si la lista se encuentra vacia o no
    *@return boolean dependiendo si la lista esta vacia (true) o no (false)
    */
    public boolean isEmpty() {
        boolean isEmpty;
        if(size == 0){
            isEmpty = true;
        }
        else{
            isEmpty = false;
        }
        return isEmpty;
    }
//endregion

/**
 * Metodo encargado de entregar un Iterator que permite recorrer la linkedlist de una manera lineal
 */
    public Iterator<T> iterator() {
        Iterator<T> res = new Iterator<T>() {
            private Node<T> now = head.getPrimerAtributo();

            /**
             * Metodo encargado de mostrar si la posicion actual que se esta recorriendo en la lista existe o no
             */
            public boolean hasNext() {
                boolean existe;
                if (now != null){
                    existe = true;
                }
                else{
                    existe = false;
                }
            return existe;
            }

            /**
             * Metodo encargado de obtener el dato del Nodo actual y cambiar al siguiente nodo
             */
            public T next() {
                T dato = now.getDato();
                now = now.getSiguienteNodo();
                return dato;
            }
       
        };
        return res;
    }

    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    public T remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean removeAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(final Collection<?> c) {
        // TODO Auto-generated method stub
        return false;
    }

    public T set(int index, Object element) {
        // TODO Auto-generated method stub
        return null;
    }

//region metodo Size
    /**
    *Metodo encargado de decir el tamaño con el que cuenta la lista
    *@return int tamaño de la lista.
    */
    public int size() {
        return size;
    }
//endregion

    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        return null;
    }

    public T[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
