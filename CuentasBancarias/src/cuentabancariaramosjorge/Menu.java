/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariaramosjorge;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menu {
    
    public static int pintaMenu(){
        Scanner leer = new Scanner(System.in);
        int i=0;
        boolean salir = false;
        
        
        while (!(i>=1 && i<=10)) {
            System.out.println("1- Ver el número de cuenta completo (CCC- Código Cuenta Cliente).");
            System.out.println("2- Ver el titular de la cuenta.");
            System.out.println("3- Ver el código de la entidad");
            System.out.println("4- Ver el código de la oficina");
            System.out.println("5- Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control).");
            System.out.println("6- Ver los dígitos de control de la cuenta");
            System.out.println("7- Realizar un ingreso. Habrá que solicitar por teclado la cantidad que se desea ingresar.");
            System.out.println("8- Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar.");
            System.out.println("9- Consultar saldo");
            System.out.println("#########################################################################################################################");
            System.out.println("10- Salir de la aplicación");  
            System.out.println("#########################################################################################################################");
            System.out.println("Escribe una de las opciones");
            i=leer.nextInt();
        }
          return i;       
    }
}
