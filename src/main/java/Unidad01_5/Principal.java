/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_5;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Principal {

    public static void main(String[] args) {
        var a = 0;
        System.out.println("a = " + a);

        a = 1;
        System.out.println("a = " + a);

        a = 2;
        System.out.println("a = " + a);

        a = a + 1;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a += 1;
        System.out.println("a = " + a);

        while (a < 10) {
            a++;
            System.out.println("a = " + a);
        }

        var numero = 0;
        var lectura = new Scanner(System.in);
        do {
            System.out.println("Ingresar numeros menores a 10");
            numero = lectura.nextInt();
            while (numero > 10) {
                System.out.println("Ingrese un numero valido(<10)");
                numero = lectura.nextInt();
            }
            System.out.println("numero = " + numero);
        } while (numero < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("hola "+ i);
        }
        var numeroList = new int[5];
        numeroList[0] = 5;
        numeroList[1] = 4;
        numeroList[2] = 74;
        numeroList[3] = 78;
        numeroList[4] = 14;

        var numeroDecimalList = new double[5];
        numeroDecimalList[0] = 1.5;
        numeroDecimalList[1] = 4.8;
        numeroDecimalList[2] = 7.8;
        numeroDecimalList[3] = 9.4;
        numeroDecimalList[4] = 8.4;

        var i = 0;
        System.out.println(numeroList[i]);
        i++;
        System.out.println(numeroDecimalList[i]);
        i++;

        System.out.println(numeroList[0]);
        System.out.println(numeroList[1]);
        System.out.println(numeroList[2]);
        System.out.println(numeroList[3]);
        System.out.println(numeroList[4]);

        System.out.println(numeroDecimalList[0]);
        System.out.println(numeroDecimalList[1]);
        System.out.println(numeroDecimalList[2]);
        System.out.println(numeroDecimalList[3]);
        System.out.println(numeroDecimalList[4]);

        
        for (int j = 0; j < numeroList.length; j++) {
            System.out.println(numeroList[j]);   
        }
        
        for (var j = 0; j < numeroDecimalList.length; j++) {
            System.out.println(numeroDecimalList[j]);   
        }
        
        var dimension=0;
        System.out.println("Ingrese la dimension del vector: ");
            dimension = lectura.nextInt();
        
        var arreglo = new int[dimension];
        
        var dato=0;
        for (int j = 0; j<arreglo.length; j++) {
            System.out.println("Ingrese el dato en la posicion "+(j+1));
            dato=lectura.nextInt();
            arreglo[j]=dato;
        }
        
        System.out.println("Los numeros ingresados son: ");
        for (int j = 0; j<arreglo.length; j++) {
            System.out.println(arreglo[j]);
            
        }
        
        
        var matriz = new int [2][3];
        
        System.out.println("Ingrese el valor correspondiente a la posición 0,0");
        matriz [0][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,1");
        matriz [0][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,2");
        matriz [0][2] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,0");
        matriz [1][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,1");
        matriz [1][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,2");
        matriz [1][2] = lectura.nextInt();
        
        System.out.println(matriz [0][0]+" "+matriz [0][1]+" "+matriz [0][2]);
        System.out.println(matriz [1][0]+" "+matriz [1][1]+" "+matriz [1][2]);
        
        
        System.out.println("Ingrese el numero de filas que tendrá la matriz");
        var filas=lectura.nextInt();
        System.out.println("Ingrese el numero de columnas que tendrá la matriz");
        var columnas=lectura.nextInt();
        
        var mat=new int[filas][columnas];
        
        var datos=0;
        for (int j = 0; j < filas; j++) {
            for (int k = 0; k < columnas; k++) {
                System.out.println("Ingrese el dato en la fila "+(j+1)+" y columna"+ (k+1));
                datos=lectura.nextInt();
                
            }
            
        }
        
        System.out.println("La matriz ingresada es: ");
        for (int j = 0; j < filas; j++) {
            System.out.println(mat[0][j]);
        }
        
        for (int j = 0; j < columnas; j++) {
            System.out.println(mat[j][0]);
        }
        
        
        
        
        
        
        
        
        
        
        
    }

}
