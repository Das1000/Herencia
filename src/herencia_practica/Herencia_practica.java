package herencia_practica;

import java.util.Scanner;

public class Herencia_practica {
    
public static void main(String[] args) {
        
Sistemas sistemas_nuevo =  new Sistemas("Sin Asignar",0,0,0,"No asignado",0,0,0,0);

    System.out.println ("****************************************");
    System.out.println ("***Atributos antes de ser modificados***");
    System.out.println ("****************************************");
    System.out.println ("1._Nombre:" + sistemas_nuevo.getNombre());
    System.out.println ("2._Numero de empleado:" + sistemas_nuevo.getNum_empleado());
    System.out.println ("3._Numero de seguro social:" + sistemas_nuevo.getNum_seguro());
    System.out.println ("4._Edad: " + sistemas_nuevo.getEdad());
    System.out.println ("5._Antigüedad:" + sistemas_nuevo.getAntiguedad());
    System.out.println ("6._id: " + sistemas_nuevo.getId());
    System.out.println ("7._Numero de terminal: " + sistemas_nuevo.getNum_terminal());
    System.out.println ("8._Numero de operador:" + sistemas_nuevo.getNum_operador());
    System.out.println ("9._Bono: " + sistemas_nuevo.getBono());
    System.out.println (" ");
    System.out.println (" ");
    
    Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int num_empleado;
        int num_seguro;
        int edad;
        String antiguedad;
        int id;
        int num_terminal;
        int num_operador;
        int bono;
        
        System.out.println("*******************************");  
        System.out.println("***Modificacion de atributos***");      
        System.out.println("*******************************");  
        System.out.println("1._Ingrese nombre:");   
        sistemas_nuevo.setNombre(nombre = entrada.next ());
        System.out.println("2._Ingrese numero de empleado:");  
        sistemas_nuevo.setNum_empleado(num_empleado = entrada.nextInt());
        System.out.println("3._Ingrese numero de seguro:");  
        sistemas_nuevo.setNum_seguro(num_seguro = entrada.nextInt());
        System.out.println("4._edad:");  
        sistemas_nuevo.setEdad(edad = entrada.nextInt());
        System.out.println("5._Ingrese la antiguedad:");  
        sistemas_nuevo.setAntiguedad(antiguedad = entrada.next());
        System.out.println("6._Ingrese el Id:");  
        sistemas_nuevo.setId(id = entrada.nextInt());
        System.out.println("7._Ingrese numero de terminal:");  
        sistemas_nuevo.setNum_terminal(num_terminal = entrada.nextInt());
        System.out.println("8._Ingrese numero de operador:");  
        sistemas_nuevo.setNum_operador(num_operador = entrada.nextInt());
        System.out.println("9._Ingrese bono de productividad:");  
        sistemas_nuevo.setBono(bono = entrada.nextInt());
        
    System.out.println ("******************************************");       
    System.out.println ("***Atributos despues de ser modificados***");
    System.out.println ("******************************************");
    System.out.println ("1._Nombre:" + sistemas_nuevo.getNombre());
    System.out.println ("2._Numero de empleado:" + sistemas_nuevo.getNum_empleado());
    System.out.println ("3._Numero de seguro social:" + sistemas_nuevo.getNum_seguro());
    System.out.println ("4._Edad: " + sistemas_nuevo.getEdad());
    System.out.println ("5._Antigüedad:" + sistemas_nuevo.getAntiguedad());
    System.out.println ("6._id: " + sistemas_nuevo.getId());
    System.out.println ("7._Numero de terminal: " + sistemas_nuevo.getNum_terminal());
    System.out.println ("8._Numero de operador:" + sistemas_nuevo.getNum_operador());
    System.out.println ("9._Bono de productividad: " + sistemas_nuevo.getBono());
	    
}
	   
}