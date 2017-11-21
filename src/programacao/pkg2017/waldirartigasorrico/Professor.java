
package professor;


public class Professor 
{
    public int codigoProfessor;
    public String nomeProfessor;

    public Professor(int c, String n)
    {
        this.codigoProfessor = c;
        this.nomeProfessor = n;
    }
    
    public int getCodigoProfessor() 
    {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) 
    {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNomeProfessor() 
    {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) 
    {
        this.nomeProfessor = nomeProfessor;
    }
    
    public void status()
    {
        System.out.println("Código: " + this.getcodigoProfessor());
        System.out.println("Professor: " + this.getnomeProfessor());
    }

    private int getcodigoProfessor()
    {
        return codigoProfessor;
    }
     
    private String getnomeProfessor() 
    {
        return nomeProfessor;
    }
}
