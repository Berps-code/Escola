import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidadeSala;
    private int numeroTurmasAlocadas;
    private Escola escola;
    private List<Turma> turmas;
    
    public Sala(int numero, int capacidadeSala, int numeroTurmasAlocadas, Escola escola) {
        this.numero = numero;
        this.capacidadeSala = capacidadeSala;
        this.numeroTurmasAlocadas = numeroTurmasAlocadas;
        this.turmas = new ArrayList<>();
        this.escola = escola;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public int getNumeroTurmasAlocadas() {
        return numeroTurmasAlocadas;
    }
    
    
}
