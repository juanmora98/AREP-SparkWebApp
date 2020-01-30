package edu.escuelaing.arep.Operations;

import edu.escuelaing.arep.models.LinkedList;
//import edu.escuelaing.arep.ASE.models.Node;
import java.lang.Math;

public class Operation {


    /**
     * Metodo encargado de realizar la sumatoria de todos los valores del tipo double en una lista
     * @param lista Linkedlist que contiene nodos con datos del tipo double a operar
     * @return double el cual es el total de la sumatoria
     */
    public static double Sumatoria(LinkedList<Double> lista){
        double totalSumatoria = 0;
        for(Double e:lista){
            totalSumatoria = totalSumatoria + e;
        }
        return totalSumatoria;
    }

    /**
     * Metodo encargado de calcular el promedio de los valores del tipo double de una linkedlist
     * @param lista Linkedlist que contiene nodos con datos del tipo double a operar
     * @return double el cual es el promedio de la lista
     */
    public static double Promedio(LinkedList<Double> lista){
        double promedioTotal = 0;
        double totalSumatoria = Sumatoria(lista);
        promedioTotal = totalSumatoria/lista.size();
        return promedioTotal;
    }

    /**
     * Metodo sumatoria encargado de sumar todos los valores de una linkedlist de valores del tipo double pero realizando una resta con un valor 
     * promedio y asi mismo elevando el resultado de la resta al cuadrado.
     * @param lista Linkedlist que contiene nodos con datos del tipo double a operar.
     * @param promedio promedio de la lista.
     * @return double el cual es el total de la sumatoria
     */
    public static double SumatoriaEspecial(LinkedList<Double> lista, double promedio){
        double totalSumatoria = 0;
        double valorAElevar;
        for(Double e:lista){
            valorAElevar = e - promedio;
            totalSumatoria = totalSumatoria + Math.pow(valorAElevar,2);
        }
        return totalSumatoria;
    }

    /**
     * Metodo encargado de calcular la desviacion estadar de una linkedlist de valores del tipo double
     * @param lista linkedlist de valores del tipo double a operar
     * @return double el cual sera el resultado de la operacion.
     */
    public static double DesviacionEstandar(LinkedList<Double> lista){
        double promedio = Promedio(lista);
        double totalSumatoriaE = SumatoriaEspecial(lista, promedio);
        double resultado = totalSumatoriaE/(lista.size()-1);
        resultado = Math.sqrt(resultado);
        return resultado;
    }


}