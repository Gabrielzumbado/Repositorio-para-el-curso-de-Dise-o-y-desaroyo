/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_practico.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author gabrielzumbadoortiz
 */
public class Ejercicio_practico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String empleados = JOptionPane.showInputDialog(null, "Cantidad de empleados que trabajan en la empreza: ");
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String Salario = JOptionPane.showInputDialog("Ingrese el salario");
        double salario = Double.parseDouble(Salario);
     

    }

}
