package pruebasarchivosplanos;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author liis
 */
public class PruebasArchivosPlanos {
// referencia 
    Archivos archivo;
  public  PruebasArchivosPlanos()
  {
      // instancia 
      archivo= new Archivos();// cada vez que se crea un nuevo archivo se borra el antiguo entonces no se debe llamar crear archivo sino a  cargar archivo
      archivo.crearArchivo();
      archivo.ingresarInformacionAlArchivo(new Persona("123", "Lis", "20"));// con esta linea le  ingresamos informacion al archivo
      archivo.ingresarInformacionAlArchivo(new Persona("145", "Lees", "30"));
      archivo.ingresarInformacionAlArchivo(new Persona("133", "Luus", "40"));
      
      
      ArrayList <Persona> array= archivo.devolverInformacionDelArchivo();
      
       for (int contador=0; contador<array.size(); contador++)
       {
          System.out.println( array.get(contador).getInformaciion());
       }
  }
  
    public static void main(String[] args) {
        // PruebasArchivosPlanos a=new  PruebasArchivosPlanos();// referencia que no necesitamos en este caso
        
         new  PruebasArchivosPlanos();
    }
    
}
