import java.util.HashMap;

public class Horario {
    private int horaInicio;
    private int horaFim;
    private int diaSemana;
    private HashMap<Integer, String> diasDaSemana;

    public Horario(int horaInicio, int horaFim, int diaSemana) {
        if (horaFim>horaInicio && (horaInicio >= 7 && horaInicio < 24) && (horaFim >= 7 && horaFim < 24)) {
            this.horaInicio = horaInicio;
            this.horaFim = horaFim;
        }

        else throw new HorarioInvalidoException("Horário inválido!");

        this.diaSemana = diaSemana;
        this.diasDaSemana = new HashMap<>();
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public int getDiaSemana() {
        return diaSemana;
    }
    
}
