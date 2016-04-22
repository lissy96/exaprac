package pruebasarchivosplanos;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Archivos
{ 
    ObjectOutputStream archivoSalida;// cuando necesito guardar informacion en el archivo 
    ObjectInputStream archivoEntrada;// este es para cuando necesito leer informacion del archivo cuando necesito cargar la informacion a un array 
 
    public Archivos()
    {
        if (cargarArchivo())
         {
            System.out.println("se cargo el archivo de forma correcta ");
         }
      else
        {
           System.out.println("error al cargar el archivo ");
        }
    }
    
    // trataremos de cargar el archivo 
    public boolean cargarArchivo()// es boolean para saber si ya esta ese archivo o no  
    {
        boolean existe=false;
          try
        { 
           archivoEntrada= new  ObjectInputStream(new FileInputStream("archivo.dat"));
           existe=true;
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
          return existe;
        // en el constructor tengo que cargar el archivo
    }
    
    // leer la informacion del archivo
    
    public void crearArchivo()
    {
        // lo mejor es utilizar un try y un catch ----- no hacerle caso a netBeans 
        try
        {
           archivoSalida= new  ObjectOutputStream(new FileOutputStream("archivo.dat"));
            System.out.println("se creo de forma correcta el archivo");
        }
        catch(Exception e)// se agregan porque se esta trabajando con el sistema operativo 
        {
            System.out.println("Error al crear archivo"+e);// este +e es para que me muestre el error 
        }
    }
    
    
    public void ingresarInformacionAlArchivo(Persona persona)// va a recibir array de un un objeto y lo va agregar al archivo
    {
        try
        {
            archivoSalida.writeObject(persona);
             System.out.println("se ingreso de forma correcta la nformacion al archivo");
        }
        catch(Exception e)
        {
            System.out.println("Error al ingresar informacion al archivo");
        }
        
       
    }
    
    
     public ArrayList<Persona> devolverInformacionDelArchivo()// se cae al final del archivo es necesario que se caiga para saber cuando se llega al final del archivo
     {
         ArrayList <Persona> array= new ArrayList<Persona>();
         try
         {
             // tecnica del casting la cual es que voy a recibir  un objeto y digo que tipo de objeto voy a recibir xq me puede devolver muchos tipos de objetos
             while(true)
             {
                 array.add( (Persona) archivoEntrada.readObject());// el read object lo que hace es leer la informacion de un bloque hasta que se cae.
                 
             }  
         }// fin del try
         catch(Exception e)
         {
                     System.out.println("Se llego al final del archivo");  
              
         }// fin del catch        
         return array;
     }
             
}
