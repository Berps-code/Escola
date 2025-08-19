import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private  List<Aluno> alunos;

    public Escola (String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
}
