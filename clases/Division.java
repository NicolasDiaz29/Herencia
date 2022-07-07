package clases;

public class Division extends Operacion
{
    //Constructor
    public Division (double x, double y)
    {
        super(x, y);
    }

    //Metodos
    public void Dividir()
    {
        resultado = x/y;
    }
}
