public class Turma {
    private int anoTurma;
    private String curso;
    private int numeroAlunos;
    
    public Turma(int anoTurma, String curso, int numeroAlunos) {
        this.anoTurma = anoTurma;
        this.curso = curso;
        this.numeroAlunos = numeroAlunos;
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
