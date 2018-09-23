/**
 * Class Pedido
 * @author Bárbara Gabriele Lima Luz Santos
 **/

public class Pedido
{
    private int numero;
    private Produto produto;
    private int status;

    public Pedido(int numero, Produto produto)
    {
        new Pedido(numero, produto, 0);
    }

    public Pedido(int numero, Produto produto, int status)
    {
        this.numero = numero;
        this.produto = produto;
        this.status = status;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return this.numero;
    }

    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }

    public Produto getProduto()
    {
        return this.produto;
    }

    public void setStatus(int status)
    {
        switch(status) {
            case 0:
                this.status = status;
            break;

            case 1:
                this.status = status;
            break;

            case 9:
                this.status = status;
            break;

            default:
                this.status = 0;
            break;
        }
    }

    public int getStatus()
    {
        return this.status;
    }

    public void servir()
    {
        setStatus(1);
    }

    public void cancelar()
    {
        setStatus(9);
    }
}
