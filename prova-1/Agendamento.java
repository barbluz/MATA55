import java.util.Date;
import java.util.ArrayList;

public class Agendamento
{
    private Carro carro;
    private Date data;
    private ArrayList<Servico> servicos;

    public Agendamento(Servico servico, Carro carro, Date data)
    {
        this.servicos = new ArrayList<Servico>();
        this.servicos.add(servico);
        this.carro = carro;
        this.data = data;
    }

    public boolean marcaMesmoDia()
    {
        boolean mesmoDia = true;
        int tempoServicos = 0;
        for(int i = 0; i < this.servicos.size(); i++)
        {
            tempoServicos += this.servicos.get(i).getDuracao();
            if (tempoServicos > 180)
            {
                mesmoDia = false;
                break;
            }
        }
        return mesmoDia;
    }

    public double precoTotal()
    {
        double precoTotal = 0;
        for(int i = 0; i < this.servicos.size(); i++)
        {
            double precoBase = this.servicos.get(i).getPrecoBase();
            switch(this.carro.getCategoria())
            {
                case "pequeno":
                    precoTotal += precoBase;
                break;

                case "medio":
                    precoTotal += (1.3 * precoBase);
                break;

                case "grande":
                    precoTotal += (1.5 * precoBase);
                break;
            }
        }

        return precoTotal;
    }

    public void setCarro(Carro carro)
    {
        this.carro = carro;
    }

    public Carro getCarro()
    {
        return this.carro;
    }

    public void setData(Date data)
    {
        if(data.after(this.data)) {
            this.data = data;
        } else {
            System.out.println("O agendamento só pode ser alterado para uma data posterior à data atual");
        }
    }

    public Date getData()
    {
        return this.data;
    }

    public void addServico(Servico servico)
    {
        this.servicos.add(servico);
    }

    public ArrayList<Servico> getServicos()
    {
        return this.servicos;
    }
}
