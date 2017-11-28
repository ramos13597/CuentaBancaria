/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariaramosjorge;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CuentaBancariaRamosJorge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera = true;
        /*Introducimos los datos y los guarda*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el titualar");
        String titular = leer.nextLine();
        System.out.println("Dime la entidad"); 
        String entidad = leer.nextLine();
        System.out.println("Cual es tu oficina"); 
        String oficina = leer.nextLine();
        System.out.println("Dime tu codigo de control"); 
        String digControl = leer.nextLine();
        System.out.println("Cual es el nuemro de tu cuenta"); 
        String numCuenta = leer.nextLine();
            
    Cuenta c1 = new Cuenta(titular, entidad, oficina, digControl, numCuenta, 0);
    

        while(bandera){
            switch(Menu.pintaMenu()){
                        case 1: 
                          
                 
                            System.out.println("Su CCC " + c1.getEntidad() + "-" + c1.getOficina() + "-" + c1.getDigControl() + "-" + c1.getNumCuenta() + " es: " + c1.comprobarCcc());

                            break;

                        case 2:
                            System.out.println("El titular de la cuenta es: " + c1.getTitular() );
                            break;

                        case 3: 
                            System.out.println("La entidad de la cuenta es: " + c1.getEntidad() );
                            break;

                        case 4: 
                            System.out.println("La oficina de la cuenta es: " + c1.getOficina() );
                            break;

                        case 5:
                            System.out.println("El numero de la cuenta es: " + c1.getNumCuenta() );
                            break;

                        case 6: 
                            System.out.println("El codigo de control de la cuenta es: " + c1.getDigControl());
                            break;

                        case 7: 
                            System.out.println("Cuanto deseas ingresar...");
                            double saldo = leer.nextDouble();
                            c1.ingrsar(saldo);
                            System.out.println("Su saldo ahora es de " + c1.getSaldo() + " €");
                            break;

                        case 8: 
                            System.out.println("Cuanto deseas retirar...");
                            saldo = leer.nextDouble();
                            c1.retirar(saldo);
                            System.out.println("Su saldo ahora es de " + c1.getSaldo() +  " €");
                            break;

                        case 9:
                            System.out.println("Su saldo es de " + c1.getSaldo() +  " €");
                            break;

                        case 10: 
                            bandera = false;
                            break;


            }
        }
            
    }
    
}
