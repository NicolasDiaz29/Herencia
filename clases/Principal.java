package clases;

import javax.swing.JOptionPane;

public class Principal 
{
    //Metodo principal
    public static void main(String[] args) 
    {
        //Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        //Creación de un objeto suma
        Suma miSuma = new Suma(x, y);
        miSuma.Sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());

        //Creación de un objeto resta
        Resta miResta = new Resta(x, y);
        miResta.Restar();
        JOptionPane.showMessageDialog(null, "La Resta de " + x + " y " + y + " es " + miResta.mostrarResultado());

        //Creación de un objeto resta
        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.Multiplicar();
        JOptionPane.showMessageDialog(null, "La Multiplicacion de " + x + " y " + y + " es " + miMultiplicacion.mostrarResultado());

        //Creación de un objeto resta
        Division miDivision = new Division(x, y);
        miDivision.Dividir();
        JOptionPane.showMessageDialog(null, "La Division de " + x + " y " + y + " es " + miDivision.mostrarResultado());

        System.exit(0);
    }
}
