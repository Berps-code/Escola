import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Sala> salas;

    public Escola (String nome, List<Professor> professores){
        this.nome = nome;
        this.alunos = new ArrayList<>();

        if (professores.isEmpty() || professores == null) {
            throw new IllegalArgumentException("Deve haver pelo menos 1 professor na escola\n"); 
        }
        
        this.professores = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarprofessor(Professor p){
        if (professores.contains(p)) {
            System.out.println("Este professor já existe nesta escola\n");
            return;
        }
        else {
            professores.add(p);
            p.adicionarEscola(this);
            System.out.println("Professor adicionado com sucesso\n");
        }
    }

    public void listaProfessores(){
        System.out.println("Professores:");
        for (Professor p : professores){
            System.out.println("\n" + p.getNome());
        }
    }
}
