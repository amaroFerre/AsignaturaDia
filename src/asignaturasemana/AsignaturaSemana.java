/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaturasemana;

// Importo paquete java.util.* para poder utilizar la clase Scanner

import java.util.*;

/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 *
 * @author Amarico
 */
public class AsignaturaSemana {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Creo variable tipo String
    
    String dia;
    
    String asignatura = "";
    
    // Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner (System.in);
    
    // Pido por teclado un día de la semana
    
    System.out.println("Introduce un día de la semana: ");
    
    dia = entrada.nextLine();
    
    // Añado una asignatura a cada caso
    
    switch (dia) {
      
      case "lunes":
        
        asignatura = "programacion";
        
        break;
        
      case "martes":
        
        asignatura = "programación";
        
        break;
        
      case "miercoles":
        
        asignatura = "Entornos de desarrollo";
        
        break;
        
      case "jueves ":
        
        asignatura = "Sistemas informáticos";
        
        break;
        
      case "viernes":
        
        asignatura = "Base de datos";
        
        break;
        
      case "sabado":
        
      case "domingo":
        
        asignatura = " Que descansar un poco";
        
        break;
        
      default:
        
        asignatura = "no existe ese dia";
      
    }
    
    System.out.println("Ha primera hora del dia "+ dia + " tienes " + asignatura);
      
     
      
      
    
    
    
    
    
    
  }
  
}
