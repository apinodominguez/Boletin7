package boletin7;

import javax.swing.JOptionPane;

public class Libreria {
    private String nomeLibro;
    private String nomeAutor;
    private int numLibros;
    private int numLibrosPrestados;
    
    //Constructores
    public Libreria (){
        nomeLibro = nomeAutor = null;
        numLibros = numLibrosPrestados = 0;
    }
    
    public Libreria (String i, String j, int k, int m){
        nomeLibro = i;
        nomeAutor = j;
        numLibros = k;
        numLibrosPrestados = m;
    }
    
    //Metodos "set" para modificar los valores de las variables
    public void setNomeLibro (String i){
       nomeLibro = i;
   }
    public void setNomeAutor (String j){
       nomeAutor = j;
   }
    public void setNumLibros (int k){
       numLibros = k;
   }
    public void setNumLibrosPrestados (int m){
       numLibrosPrestados = m;
    }
    
    //metodos "get" para mostrar los valores de las variables
    public String getNomeLibro (){
       return nomeLibro;
    }
    public String getNomeAutor (){
       return nomeAutor;
    }
    public int getNumLibros (){
       return numLibros;
    }
    public int getNumLibrosPrestados (){
        return numLibrosPrestados;
    }
    
    //metodo operacional
    public void prestarLibros(){
        if (numLibros > 0){ //si el numero de libros es mayor que cero, podemos prestarlos
            numLibros = -- numLibros; //restamos una unidad al valor que tenemos
            numLibrosPrestados = ++ numLibrosPrestados; // sumamos una unidad a los libros prestados
            JOptionPane.showMessageDialog(null, "El libro " + nomeLibro + " fue prestado con exito");
        }
        else {
            JOptionPane.showMessageDialog(null, "No existen copias disponibles del libro para su prestamo");
        }
    }
    
    public void devolverLibros(){
        if (numLibrosPrestados > 0){
            numLibrosPrestados = -- numLibrosPrestados;
            numLibros = ++ numLibros;
            JOptionPane.showMessageDialog(null, "El libro " + nomeLibro + " fue devuelto con exito");
        }
        else{
            JOptionPane.showMessageDialog(null, "El libro seleccionado no fue prestado actualmente");
        }
    }
    
    public String toString(){
        String mensaje = "El libro se titula "+nomeLibro+" del autor "+nomeAutor+"\nDisponemos "+numLibros+" copias de el, de las cuales, "+numLibrosPrestados+" copias han sido prestadas";
        return mensaje;
    }
    
}
