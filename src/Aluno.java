import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private  String nome;
    private Escola escola;
    private List<Turma> turmas;

    public Aluno (String matricula, String nome, Escola escola){
        this.matricula = matricula;
        this.nome = nome;
        this.turmas = new ArrayList<>();
        this.escola = escola;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Escola getEscola() {
        return escola;
    }
}
