
package professor;

class ProfessorApp 
{
    public static void main(String[] args)
    {
        Professor P1 = new Professor(001, "Carlos");
        P1.status();
        
        ProfessorEspecialista PE1 = new ProfessorEspecialista(001, "Macelo", "Matematica",1,"Carlos" );
        PE1.statusPE();
        
        ProfessorMestre PM1 = new ProfessorMestre(001, "Antonio", "TADS",1,"Carlos" );
        PM1.statusPM();
        
    }



}
