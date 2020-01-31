
package edu.escuelaing.arep.app;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.escuelaing.arep.models.LinkedList;
import edu.escuelaing.arep.Operations.*;


public class OperationTest{
    /**
     * Prueba realizada para comprobar si esta agregando adecuadamente un valor a la lista
     */
    @Test
    public void SumatoriaTest(){
        double valorTotal = 6389;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operation.Sumatoria(lista);
        System.out.println("Prueba sumatoria "+total);
        assertTrue(valorTotal == total);
    }

    /**
     * Prueba realizada para obtener el promedio de una cadena de valores
     */
    @Test
    public void PromedioTest(){
        double valorTotal = 638.9;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operation.Promedio(lista);
        System.out.println("Prueba promedio "+total);
        assertTrue(valorTotal == total);
    }

    /**
     * Prueba realizada para verificar el proceso de la Sumatoria especial
     */
    @Test
    public void SumatoriaETest(){
        double valorTotal = 3522761.90;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operation.SumatoriaEspecial(lista,Operation.Promedio(lista));
        System.out.println("SumatoriaE prueba " + total);
        double valorDelta = 1;
        double valorPorDecimales = Math.abs(total - valorTotal);
        assertTrue(valorDelta == valorPorDecimales);
    }

    /**
     * Prueba realizada para verificar el proceso de la variacion estandar.
     */
    @Test
    public void SumatoriaVariacionEstandarTest(){
        double valorTotal = 625.633981;
        double valorPrueba1 = 186;
        double valorPrueba2 = 699;
        double valorPrueba3 = 132;
        double valorPrueba4 = 272;
        double valorPrueba5 = 291;
        double valorPrueba6 = 331;
        double valorPrueba7 = 199;
        double valorPrueba8 = 1890;
        double valorPrueba9 = 788;
        double valorPrueba10 = 1601;
        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(valorPrueba1);
        lista.add(valorPrueba2);
        lista.add(valorPrueba3);
        lista.add(valorPrueba4);
        lista.add(valorPrueba5);
        lista.add(valorPrueba6);
        lista.add(valorPrueba7);
        lista.add(valorPrueba8);
        lista.add(valorPrueba9);
        lista.add(valorPrueba10);
        double total = Operation.DesviacionEstandar(lista);
        total = Math.round(total * 1000000d)/1000000d;
        System.out.println("Variacion estandar prueba "+total);
        assertTrue(valorTotal == total);
    }

    
}
