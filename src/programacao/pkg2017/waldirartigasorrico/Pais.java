

package programacao.pkg2017.waldirartigasorrico;

public class Pais 
{
    private String nome;
    private String capital;
    private int dimensao;
    private Pais[] fronteiras;

    public Pais(String p, String c, int d)
    {
        this.nome = p;
        this.capital = c;
        this.dimensao = d;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public Pais[] getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(Pais[] fronteiras) {
        this.fronteiras = fronteiras;
    }

    public void status()
    {
        System.out.println("Pais: " + this.getNome());
        System.out.println("Capital: " + this.getCapital());
        System.out.println("Dimensao: " + this.getDimensao());
    }
}