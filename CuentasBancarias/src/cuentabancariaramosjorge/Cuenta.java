/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariaramosjorge;

import com.sun.deploy.uitoolkit.impl.fx.ui.DialogTemplate;

/**
 *
 * @author alumno
 */
public class Cuenta {
    
    
    private String titular;                                                     /*titular de la cuenta */
    private String entidad, oficina, digControl, numCuenta;                        /* numero entero de cuenta*/
    private double saldo;                                                       /* saldo en double por si es decimal*/

    
    public Cuenta(String titular, String entidad, String oficina, String digControl, String numCuenta, double saldo) {
        this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.digControl = digControl;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
        public Cuenta(String titular, String entidad, String oficina, String digControl, String numCuenta) {
        this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.digControl = digControl;
        this.numCuenta = numCuenta;
        this.saldo = 0;
       
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the entidad
     */
    public String getEntidad() {
        return entidad;
    }

    /**
     * @param entidad the entidad to set
     */
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    /**
     * @return the oficina
     */
    public String getOficina() {
        return oficina;
    }

    /**
     * @param oficina the oficina to set
     */
    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    /**
     * @return the digControl
     */
    public String getDigControl() {
        return digControl;
    }

    /**
     * @param digControl the digControl to set
     */
    public void setDigControl(String digControl) {
        this.digControl = digControl;
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public void ingrsar (double saldo){
        this.saldo = this.saldo+saldo;
    }
    
    public void retirar (double saldo){
        this.saldo = this.saldo-saldo;
    }
    
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
      
    private boolean comprobarCcc() {
      int dc1, dc2 ;
      int resultado1 = 0;
      int resultado2 = 0;
      int resultado3 = 0;
      int resultado4 = 0;
      resultado1 += Integer.parseInt(oficina.substring(0,1))*4;
      resultado1 += Integer.parseInt(oficina.substring(1,2))*8;
      resultado1 += Integer.parseInt(oficina.substring(2,3))*5;
      resultado1 += Integer.parseInt(oficina.substring(3,4))*10;
      
      
      
      
      resultado1 += Integer.parseInt(entidad.substring(0,1))*9;
      resultado1 += Integer.parseInt(entidad.substring(1,2))*7;
      resultado1 += Integer.parseInt(entidad.substring(2,3))*3;
      resultado1 += Integer.parseInt(entidad.substring(3,4))*6;
       
      
      
     resultado2 = resultado1 % 11;
    
        if ((11-resultado2) == 10) {
           dc1 = 1;   
        }else{
            if((11-resultado2) == 11) {
                dc1 = 0;
            }else{
                dc1 = 11 - resultado2;
            }
        }
     
        
     resultado3 += Integer.parseInt(numCuenta.substring(0,1))*1;   
     resultado3 += Integer.parseInt(numCuenta.substring(1,2))*2;  
     resultado3 += Integer.parseInt(numCuenta.substring(2,3))*4;   
     resultado3 += Integer.parseInt(numCuenta.substring(3,4))*8;   
     resultado3 += Integer.parseInt(numCuenta.substring(4,5))*5;   
     resultado3 += Integer.parseInt(numCuenta.substring(5,6))*10;   
     resultado3 += Integer.parseInt(numCuenta.substring(6,7))*9;   
     resultado3 += Integer.parseInt(numCuenta.substring(7,8))*7;   
     resultado3 += Integer.parseInt(numCuenta.substring(8,9))*3;   
     resultado3 += Integer.parseInt(numCuenta.substring(9,10))*6;   
    
    resultado4 = resultado3 % 11;
    
    if ((11-resultado2) == 10) {
           dc2 = 1;   
        }else{
            if((11-resultado2) == 11) {
                dc2 = 0;
            }else{
                dc2 = 11 - resultado2;
            }
        }
    
    if ((Integer.toString(dc1) + Integer.toString(dc2)).equalsIgnoreCase(digControl)){
        return true;
    }else{
        return false;
    }
    /*AQUI RELIZAMOS LA OPERACION PARA COMPROBAR EL DC*/
    }
}    

 
