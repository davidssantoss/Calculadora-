/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    public static void main (String [] args){
        Calculadora miCalculadora=new Calculadora();
        Interfaz miInterfaz=new Interfaz();
        miInterfaz.setVisible(true);
        miInterfaz.calculadoraGrafica=miCalculadora;
        
    }
    
}
