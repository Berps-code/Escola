import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int numeroAulasMinistradas;
    private String nome;
    private String siape;
    private List<Escola> escolas;
    private List<Turma> turmas;

    public Professor (int numeroAulasMinistradas, String nome, String siape) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
        this.nome = nome;
        this.siape = siape;
        this.escolas = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public int getNumeroAulasMinistradas() {
        return numeroAulasMinistradas;
    }

    public String getNome() {
        return nome;
    }

    public String getSiape() {
        return siape;
    }

    public void adicionarEscola(Escola e){
        if (escolas.contains(e)) {
            System.out.println("O professor já leciona nesta escola\n");
            return;
        }

        else {
            escolas.add(e);
            e.adicionarprofessor(this);
            System.out.println("Escola adicionada com sucesso\n");
        }
    }
    
}
