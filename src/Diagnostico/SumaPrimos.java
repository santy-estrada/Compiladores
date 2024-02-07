package Diagnostico;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isaac
 */
public class SumaPrimos {

    public static List<Integer> primos = new ArrayList();

    public static void main(String[] args) {
        int maxNumero = 1000;
        int sumaMaxima = 0; //mayor suma de numeros primos consecutivos
        int longitudMaxima = 2;
        int longitudSumaPrimos = 2; //longitud de secuencia de números primos

        primos.add(2); //adicionamos el 2;

        //calculamos los números primos menores a maxNumero
        for (int i = 3; i <= maxNumero; i += 2) {
            if (isPrimo(i)) {
                primos.add(i);
            }
        }

       //Iniciamos a validar longitudes empezando por 2
        while(longitudSumaPrimos <= primos.size()){
            int sumaTemp = procesarSumas(longitudSumaPrimos, maxNumero);
            if(longitudSumaPrimos > longitudMaxima && sumaTemp > 0 ){
                sumaMaxima = sumaTemp;
                longitudMaxima = longitudSumaPrimos;
            }
            longitudSumaPrimos++;
        }

        System.out.println(longitudMaxima);
        System.out.println(sumaMaxima);
    }

    public static boolean isPrimo(int numero) {
        boolean primo = true;

        int raiz = (int) (Math.sqrt(numero));

        for (Integer i : primos) {
            if (i > raiz) {
                break;
            }
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        return primo;
    }

    public static int procesarSumas(int longitud, int maxSuma) {
        System.out.println("***** Procesando longitud " + longitud + " *****");
        int sumaMaximaPrima = 0;
        int indexInicial = 0;
        int indexFinal = indexInicial + longitud - 1;

        /*
        Si la longitud es impar no sumo el indice 0 que contiene al 2
        */
        if(longitud % 2 != 0){
            indexInicial++;
            indexFinal++;
        }

        while (indexFinal < primos.size()) {
            int sumaParcial = 0;
            for (int i = indexInicial, j = indexFinal; i <= j; i++) {
                sumaParcial += primos.get(i);
            }
            /*
            Si la suma parcial es mayor al número maximo no seguimos la busqueda
            */
            if(sumaParcial > maxSuma){
                break;
            }

            if(existeEnPrimos(sumaParcial)){
                sumaMaximaPrima = sumaParcial;
            }
            /*
            si la longitud es par solo hacemos una suma, descartamos el resto 
            de sumas por que van a dar par. 
            */
            if (longitud % 2 == 0) {
                break;
            }
            indexInicial++;
            indexFinal++;
        }

        System.out.println("Suma Maxima Prima para longitud " + longitud + " es " + sumaMaximaPrima);
        return sumaMaximaPrima;
    }

    public static int sumarPrimos(int indexInicio, int indexFinal) {
        int suma = 0;

        for (; indexInicio <= indexFinal; indexInicio++) {
            suma += primos.get(indexInicio);
        }

        return suma;
    }

    public static boolean existeEnPrimos(int numero) {
        return primos.contains(numero);
    }

}