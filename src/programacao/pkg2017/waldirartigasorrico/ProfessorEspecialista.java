
package professor;

public class ProfessorEspecialista extends Professor
{
    public int codigoProfessorEspecialista;
    public String nomeProfessorEspecialista;
    public String cursoEspecializacao;

    public ProfessorEspecialista(int codigoProfessorEspecialista, String nomeProfessorEspecialista, String cursoEspecializacao, int c, String n) {
        super(c, n);
        this.codigoProfessorEspecialista = codigoProfessorEspecialista;
        this.nomeProfessorEspecialista = nomeProfessorEspecialista;
        this.cursoEspecializacao = cursoEspecializacao;
    }

        public int getCodigoProfessorEspecialista() 
    {
        return codigoProfessorEspecialista;
    }

    public void setCodigoProfessorEspecialista(int codigoProfessorEspecialista) 
    {
        this.codigoProfessorEspecialista = codigoProfessorEspecialista;
    }

    public String getNomeProfessorEspecialista() 
    {
        return nomeProfessorEspecialista;
    }

    public void setNomeProfessorEspecialista(String nomeProfessorEspecialista) 
    {
        this.nomeProfessorEspecialista = nomeProfessorEspecialista;
    }

    public String getCursoEspecializacao() 
    {
        return cursoEspecializacao;
    }

    public void setCursoEspecializacao(String cursoEspecializacao) 
    {
        this.cursoEspecializacao = cursoEspecializacao;
    }

    public void statusPE()
    {
        System.out.println("Código: " + this.getcodigoProfessorEspecialista());
        System.out.println("Nome: " + this.getnomeProfessorEspecialista());
        System.out.println("Especialista em: " + this.getcursoEspecializacao());
    }

     private int getcodigoProfessorEspecialista()
    {
        return codigoProfessorEspecialista;
    }
     
    private String getnomeProfessorEspecialista() 
    {
        return nomeProfessorEspecialista;
    }
    
    private String getcursoEspecializacao() 
    {
        return cursoEspecializacao;
    }
}
