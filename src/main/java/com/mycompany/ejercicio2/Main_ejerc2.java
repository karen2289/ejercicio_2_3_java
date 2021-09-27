package com.mycompany.ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Ejercicio 2 -- Armar un programa que permita cargar 3 numeros y mostrar cual es el promedio
 * @author Karen
 */
public class Main_ejerc2 {
    /*
    public static void main(String[] args) {
        
        System.out.println("Ingrese el primer numero");
        Integer num1 = cargarNumero();
        
        System.out.println("Ingrese el primer numero");
        Integer num2 = cargarNumero();
        
        System.out.println("Ingrese el primer numero");
        Integer num3 = cargarNumero();
        
        //Integer para numeros enteros
        Integer suma = num1 + num2 + num3;
        //Double para numeros decimales
        Double numeroPromdio = Double.valueOf(suma) / 3;
        System.out.println("El numero promedio es: " + numeroPromdio);
        
    }


    private static Integer cargarNumero(){
        
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        
        return numero;
        
    }*/
    
    
    //Ejercicio 3
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero");
        Integer numero = cargarNumero();
        
        
        Boolean esPar = (numero % 2) == 0;
        if(esPar){
            System.out.println("El numero es par");
        } else{
            System.out.println("El numero es impar");
        }
                
        
    }
    
    
    private static Integer cargarNumero(){
        
        InputStreamReader capturarTeclado = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        
        return numero;
        
    }
    
}
