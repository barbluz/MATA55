/**
 * Class Produto
 * @author Bárbara Gabriele Lima Luz Santos
 **/

public class Produto
{
    private int codigo;
    private String nome;
    private int tipo;
    private double preco;
    private boolean disponibilidade;

    public Produto (int codigo, String nome, int tipo)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Produto (int codigo, String nome, int tipo, boolean disponibilidade, double preco)
    {
        new Produto(codigo, nome, tipo);
        this.disponibilidade = disponibilidade;
        this.preco = preco;
    }

    public void setCodigo (int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo ()
    {
        return this.codigo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setTipo(int tipo)
    {
        if (tipo == 0 || tipo == 1 || tipo == 9)
        {
            this.tipo = tipo;
        }
    }

    public int getTipo()
    {
        return this.tipo;
    }

    public void setDisponibilidade(boolean disponibilidade)
    {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade()
    {
        return this.disponibilidade;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public double getPreco()
    {
        return this.preco;
    }
}
