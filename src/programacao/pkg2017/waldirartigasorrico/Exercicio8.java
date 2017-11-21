
package programacao.pkg2017.waldirartigasorrico;

public class Exercicio8 
{
private String rua;
private String cep;
public String NCep;
    public Exercicio8(String p, String c)
    {
        this.rua = p;
        this.cep = c;
        this.NCep = c;
     }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void status()
    {
        System.out.println("Rua: " + this.getRua());
        String mostracep = NCep;
	String bloco1 = mostracep.substring(0, 5);
	String bloco2 = mostracep.substring(5, 8);
	mostracep = bloco1+"-"+bloco2;
	System.out.println(mostracep);		
	
        
    }
 }   

