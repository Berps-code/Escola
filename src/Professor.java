public class Professor {
    private int numeroAulasMinistradas;
    private String nome;
    private String siape;

    public Professor (int numeroAulasMinistradas, String nome, String siape) {
        this.numeroAulasMinistradas = numeroAulasMinistradas;
        this.nome = nome;
        this.siape = siape;
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

    
}
