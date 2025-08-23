import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando escola
        Professor p1 = new Professor(0, "Galba", "ALguma coisa");
        List<Professor> p = new ArrayList<>();
        p.add(p1);

        Escola e1 = new Escola("CEFET", p);
        
    }
}
