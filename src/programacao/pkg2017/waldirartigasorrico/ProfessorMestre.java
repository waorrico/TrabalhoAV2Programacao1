
package professor;

public class ProfessorMestre extends Professor
{
    public int codigoProfessorMestre;
    public String nomeProfessorMestre;
    public String cursoMestrado;

    public ProfessorMestre(int codigoProfessorMestre, String nomeProfessorMestre, String cursoMestrado, int c, String n) {
        super(c, n);
        this.codigoProfessorMestre = codigoProfessorMestre;
        this.nomeProfessorMestre = nomeProfessorMestre;
        this.cursoMestrado = cursoMestrado;
    }

    public int getCodigoProfessorMestre() 
    {
        return codigoProfessorMestre;
    }

    public void setCodigoProfessorMestre(int codigoProfessorMestre) 
    {
        this.codigoProfessorMestre = codigoProfessorMestre;
    }

    public String getNomeProfessorMestre() 
    {
        return nomeProfessorMestre;
    }

    public void setNomeProfessorMestre(String nomeProfessorMestre) 
    {
        this.nomeProfessorMestre = nomeProfessorMestre;
    }

    public String getCursoMestrado() 
    {
        return cursoMestrado;
    }

    public void setCursoMestrado(String cursoMestrado) 
    {
        this.cursoMestrado = cursoMestrado;
    }


    public void statusPM()
    {
        System.out.println("Código: " + this.getcodigoProfessorMestre());
        System.out.println("Nome: " + this.getnomeProfessorMestre());
        System.out.println("Mestre em: " + this.getcursoMestrado());
    }
    
     private int getcodigoProfessorMestre()
    {
        return codigoProfessorMestre;
    }
     
    private String getnomeProfessorMestre() 
    {
        return nomeProfessorMestre;
    }
    
    private String getcursoMestrado() 
    {
        return cursoMestrado;
    }
    
}
