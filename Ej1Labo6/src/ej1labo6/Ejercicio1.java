/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1labo6;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio1 {
    private final Scanner sc = new Scanner(System.in);
    private final int tamanho = 5;
    private int num_recibidos = 0;
    private final int []arreglo = new int[tamanho];
    
    public void recibe(){
        for(int i = 0; i < tamanho; i++){
            System.out.println("\nIntroduzca un numero entre 10 y 100");
            int num = sc.nextInt();
            while(num < 10 || num > 100){
                System.out.println("\nPor favor introduzca un numero entre 10 y 100");
                num = sc.nextInt();
            }
            arreglo[i] = num;
            num_recibidos++;
            imprimir();
        }
        System.out.println();
    }
    
    private void imprimir(){
        System.out.printf("\nNumeros recibidos: %d",num_recibidos);
        System.out.printf("\nArreglo sin numeros repetidos: [ %d",arreglo[0]);
        
        for(int i = 1; i < num_recibidos; i++){
            for(int j = 0; j < i; j++){
                if(arreglo[i] == arreglo[j]){
                    arreglo[i] = 0;
                    break;
                }
            }
            if(arreglo[i] != 0){
                System.out.printf(" %d",arreglo[i]);
            }
        }
        System.out.printf(" ]\n");
    }
}

