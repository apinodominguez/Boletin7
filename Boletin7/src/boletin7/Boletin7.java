package boletin7;

import javax.swing.JOptionPane;

public class Boletin7 {

    public static void main(String[] args) {
        Libreria obxLib1 = new Libreria();
        obxLib1.setNomeLibro(JOptionPane.showInputDialog("Introduce el titulo del libro: "));
        obxLib1.setNomeAutor(JOptionPane.showInputDialog("Introduce el nombre del autor del libro: "));
        obxLib1.setNumLibros(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de copias del libro: ")));
        obxLib1.setNumLibrosPrestados(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de copias del libro prestadas: ")));
        
        System.out.println(obxLib1.toString());
        
        obxLib1.prestarLibros();
       
        
       
        
        System.out.println(obxLib1.toString());
    }
    
}
