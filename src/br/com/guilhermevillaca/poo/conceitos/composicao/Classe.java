import java.util.ArrayList;
import java.util.List;

class Quarto {
    private String nome;

    public Quarto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Casa {
    private List<Quarto> quartos;  // Composição - Casa "possui" Quarto

    public Casa() {
        quartos = new ArrayList<>();
        quartos.add(new Quarto("Quarto Principal"));
        quartos.add(new Quarto("Quarto de Hóspedes"));
        quartos.add(new Quarto("Cozinha"));
        quartos.add(new Quarto("Sala de Estar"));
    }

    public void mostrarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("Casa tem: " + quarto.getNome());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.mostrarQuartos();
    }
}
