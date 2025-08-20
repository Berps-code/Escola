import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int anoTurma;
    private String curso;
    private int numeroAlunos;
    private List<Aluno> alunos;
    private Sala sala;
    private Professor professor;
    private List<Horario> horarios;
    
    public Turma(int anoTurma, String curso, int numeroAlunos) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.numeroAlunos = numeroAlunos;
        this.alunos = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public int getAnoTurma() {
        return anoTurma;
    }

    public String getCurso() {
        return curso;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    
}
