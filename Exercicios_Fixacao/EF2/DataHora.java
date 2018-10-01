public class DataHora
{
    private int dia, mes, ano;
    Horario hora;

    public DataHora(int dia, int mes, int ano, int hora, int minuto)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = new Horario(hora, minuto);
    }

    public DataHora(int dia, int mes, int ano)
    {
        this(dia, mes, ano, 0, 0);
    }

    public DataHora(int hora, int minuto)
    {
        this(0, 0, 0, hora, minuto);
    }

    public void ajustar(int dia, int mes, int ano)
    {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void ajustar(int hora, int minuto)
    {
        this.setHora(hora);
        this.setMinuto(minuto);
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getDia()
    {
        return this.dia;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getMes()
    {
        return this.mes;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getAno()
    {
        return this.ano;
    }

    public void setHora(int hora)
    {
        this.hora.setHora(hora);
    }

    public int getHora()
    {
        return this.hora.getHora();
    }

    public void setMinuto(int minuto)
    {
        this.hora.setMinuto(minuto);
    }

    public int getMinuto()
    {
        return this.hora.getMinuto();
    }
}
