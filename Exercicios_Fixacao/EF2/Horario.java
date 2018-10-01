public class Horario
{
    private int hora, minuto;

    public Horario()
    {
        this(0, 0);
    }

    public Horario(int hora, int minuto)
    {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void setHora(int hora)
    {
        this.hora = hora;
    }

    public int getHora()
    {
        return this.hora;
    }

    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    public int getMinuto()
    {
        return this.minuto;
    }
}
