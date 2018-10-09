public class Carro
{
    private String modelo;
    private String cor;
    private String categoria;

    public Carro(String modelo, String cor, String categoria)
    {
        if(categoria.equals("pequeno") || categoria.equals("medio") || categoria.equals("grande") ) {
            this.modelo = modelo;
            this.cor = cor;
            this.categoria = categoria;
        } else {
            System.out.println("A categoria informada não é válida");
        }
    }

    public Carro(String modelo, String cor)
    {
        this(modelo, cor, "medio");
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getCor()
    {
        return this.cor;
    }

    public void setCategoria(String Categoria)
    {
        if(categoria.equals("pequeno") || categoria.equals("medio") || categoria.equals("grande") ) {
            this.categoria = categoria;
        } else {
            System.out.println("A categoria informada não é válida");
        }
    }

    public String getCategoria()
    {
        return this.categoria;
    }
}
