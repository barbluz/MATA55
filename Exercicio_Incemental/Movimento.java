/**
 * Class Movimento
 * @author Bárbara Gabriele Lima Luz Santos
 **/

import java.util.Calendar;

public class Movimento
{
    private int mesa;
    private Calendar dataAbertura;
    private Calendar dataFechamento;
    private int status;
    private Pedido[] pedidos;

    public Movimento (Calendar dataAbertura, int mesa)
    {
        this.dataAbertura = dataAbertura;
        this.mesa = mesa;
        this.status = 0;
    }

    public void setMesa(int mesa)
    {
        this.mesa = mesa;
    }

    public int getMesa()
    {
        return this.mesa;
    }

    public void setDataAbertura(Calendar dataAbertura)
    {
        this.dataAbertura = dataAbertura;
    }

    public Calendar getDataAbertura()
    {
        return this.dataAbertura;
    }

    public void setDataFechamento(Calendar dataFechamento)
    {
        this.dataFechamento = dataFechamento;
    }

    public Calendar getDataFechamento()
    {
        return this.dataFechamento;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public int getStatus()
    {
        return this.status;
    }

    public void pagar(Calendar dataFechamento)
    {
        setDataFechamento(dataFechamento);
        setStatus(1);
    }

    public void fechar(Calendar dataFechamento)
    {
        setDataFechamento(dataFechamento);
        setStatus(9);
    }

}
