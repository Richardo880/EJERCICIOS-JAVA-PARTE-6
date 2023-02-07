/*
Una pequeña aerolínea acaba de comprar
una computadora para su nuevo sistema de reservaciones automatizado.
Se le ha pedido a usted que desarrolle el nuevo sistema.
Usted escribirá una aplicación para asignar asientos en cada vuelo del
único avión de la aerolínea (capacidad: 10 asientos).
Su aplicación debe mostrar las siguientes alternativas:
Por favor escriba 1 para Primera Clase y Por favor escriba 2 para Económico.
Si el usuario
escribe 1, su aplicación debe asignarle un asiento en la sección de primera clase (asientos 1 a 5).
Si el usuario escribe2, su aplicación debe asignarle un asiento en la sección económica (asientos
6 a 10). Su aplicación deberá entonces imprimir un pase de abordar, indicando el número de asiento
de la persona y si se encuentra en la sección de primera clase o clase económica. Use un arreglo
unidimensional del tipo primitivo boolean para representar la tabla de asientos del avión. Inicialice
todos los elementos del arreglo con false para indicar que todos los asientos están vacíos. A medida
que se asigne cada asiento, establezca el elemento correspondiente del arreglo en true para indicar
que ese asiento ya no está disponible. Su aplicación nunca deberá asignar un asiento que ya haya
sido asignado. Cuando esté llena la sección económica, su programa deberá preguntar a la persona
si acepta ser colocada en la sección de primera clase (y viceversa). Si la persona acepta, haga
la asignación de asiento apropiada. Si no, imprima el mensaje “El próximo vuelo sale en 3 horas”.
 */
package ej2labo6;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ej2Labo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentaDeBoletos venta = new VentaDeBoletos();
        int asiento=0;
        int opcion=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("(Sistema de reservaciones de una aerolínea).");
        
        
        do{
        
        do{  
            System.out.println("Elige el Tipo de Boleto");
            System.out.println("1. Primera Clase \t2.Clase Economica ");
            
            try{
                asiento = Integer.parseInt(leer.nextLine());
            }catch(Exception ex){
                System.out.println("Hubo un error");
            }
        }while(asiento!=1 && asiento!=2 );
        venta.asignar(asiento);
        
            if(venta.getSalir()==1){
            break;
            }
            System.out.println("¿Desea comprar otro boleto \n1. Si \n 2.No.?");
                try{
                opcion = Integer.parseInt(leer.nextLine());
                }catch(Exception ex){
                opcion=2;
                }
        }while(opcion==1);
        
        venta.mostrar();
        
    
    }
    
}
