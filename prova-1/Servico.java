public class Servico
{
    private String nome;
    private String descricao;
    private int duracao;
    private double precoBase;

    public Servico(String nome, String descricao, int duracao, double precoBase)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.precoBase = precoBase;
    }

    public Servico(String nome, String descricao, double precoBase)
    {
        this(nome, descricao, 60, precoBase);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    public void setDuracao(int duracao)
    {
        this.duracao = duracao;
    }

    public int getDuracao()
    {
        return this.duracao;
    }

    public void setPrecoBase(double precoBase)
    {
        this.precoBase = precoBase;
    }

    public double getPrecoBase()
    {
        return this.precoBase;
    }
}
