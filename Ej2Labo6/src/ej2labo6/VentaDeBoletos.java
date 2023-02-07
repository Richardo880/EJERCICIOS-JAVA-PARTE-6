/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2labo6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class VentaDeBoletos {

    int i=0, j=5;

    int numAsiento=0;

    int llenoA=0;

    int llenoB=0;

    int opcion;

    int salir=0;

    Scanner leer = new Scanner (System.in);

    boolean [] vuelo= new boolean[10];

 

    public VentaDeBoletos(){

    Arrays.fill(vuelo, Boolean.FALSE);

    }

 

    public int getSalir(){

    return salir;

    }

 

 

 

    public void asignar( int asiento){

        if(asiento ==1)

        {

            if(vuelo[i]==false){

            vuelo[i]= true;

            numAsiento = (i+1);

            i=0;           llenoA++;

                System.out.println("Tu asiento asignado es:" + numAsiento); 

                System.out.println("Tu asiento es de Primera Clase");

            }

            else{

                if(i<4){

               i++;        asignar (1);           }

                else{

                    System.out.println("Lo sientimos 'Primera Clase ' esta llena ");

                    System.out.println("Desea un boleto de clase Economica \n1. Si \n2. No");

                    try{  opcion = Integer.parseInt(leer.nextLine());

                        if(opcion ==1){

                            if(llenoB<5){             asignar(2);             }

                            else{   System.out.println("El avion esta lleno \n  El proximo vuelo sale en 3 horas  ");

                              salir =1;   }

                        }

                        else{  System.out.println("El avion esta lleno \n  El proximo vuelo sale en 3 horas  ");

                              salir =1;    }

                    }

                    catch(Exception ex){

                    } 

                }

            }

        }

    //Clase Economica

 

       if(asiento ==2)

        {

            if(vuelo[j]==false){

            vuelo[j]= true;

            numAsiento = (j+1);

            j=5;     llenoB++;

                System.out.println("Tu asiento asignado es:" + numAsiento); 

                System.out.println("Tu asiento es de Clase Economica");

            }         else{

                if(j<9){             j++;       asignar (2);                }

                else{

                    System.out.println("Lo sientimos 'Clase Economica' esta llena ");

                    System.out.println("Desea un boleto de Primera clase  \n1. Si \n2. No");

                    try{

                        opcion = Integer.parseInt(leer.nextLine());

                        if(opcion ==1){

                            if(llenoA<5){          asignar(2);         }

                            else{

                                System.out.println("El avion esta lleno \n  El proximo vuelo sale en 3 horas  ");

                              salir =1;

                            }

                        }

                        else{System.out.println("El avion esta lleno \n  El proximo vuelo sale en 3 horas  ");

                              salir =1;      }         }

                    catch(Exception ex){

                    } 

                }

            }

        }

    }

 

 

    public void mostrar(){

 

        for (int k = 0; k < vuelo.length; k++) {

     

            if(k==0){

            System.out.println("********************Primera Clase *********************\n\t Asiento 1\t Asiento 2\t Asiento 3\t Asiento 4\t Asiento 5");

            }

            if(vuelo[k]==true){

                System.out.print("\tAsignado");

            }

            else{
                System.out.println("\tNo Asignado");
            }

         

         

            if(k==4){

                System.out.print("\n\n ***************************Clase Economica**********"

                        + "\n\tAsiento 6\tAsiento 7\tAsiento 8\tAsiento 9\tAsiento 10");

            }

         

         

        }

    }

}

