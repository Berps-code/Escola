public class Sala {
    private int numero;
    private int capacidadeSala;
    private int numeroTurmasAlocadas;
    
    public Sala(int numero, int capacidadeSala, int numeroTurmasAlocadas) {
        this.numero = numero;
        this.capacidadeSala = capacidadeSala;
        this.numeroTurmasAlocadas = numeroTurmasAlocadas;
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
