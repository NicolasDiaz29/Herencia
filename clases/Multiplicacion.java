package clases;

public class Multiplicacion extends Operacion
{
    //Constructor
    public Multiplicacion (double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void Multiplicar()
    {
        resultado = x*y;
    }
}
