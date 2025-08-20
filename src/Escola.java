import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Sala> salas;

    public Escola (String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.salas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
}
