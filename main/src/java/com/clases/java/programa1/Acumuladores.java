package com.clases.java.programa1;

public class Acumuladores {
    public static void main(String[] args) {
        double acumulador;
        //Iniciamos acumulador le damos valor 10
        acumulador=10;
        //acumulador suma el resultado es 16
        acumulador+=6;
        System.out.println("El resuldado de acumulador suma es "+acumulador);
        //acumulador resta el resultado es 13
        acumulador-=3;
        System.out.println("El resuldado de acumulador resta es "+acumulador);
        //acumulador multiplicacion el resultado es 26
        acumulador*=2;
        System.out.println("El resultado de acumulador multiplicacion es "+acumulador);
        //acumulador division (dividir entre 0.5 es multiplicar por 2)
        //MATEMATICAS
        //el resultado es 52
        acumulador/=0.5;
        System.out.println("El resultado de acumulador division es "+acumulador);
        //acumulador resto o modulo
        acumulador%=3;
        System.out.println("El resultado de acumulador resto(modulo) es "+acumulador);



    }
}
