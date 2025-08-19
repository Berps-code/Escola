public class Aluno {
    private String matricula;
    private  String nome;
    private Escola escola;

    public Aluno (String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
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
