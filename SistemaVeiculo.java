// --- Classe Veiculo (Superclasse) ---
class Veiculo {
    String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public void ligar() {
        System.out.println("Veículo " + marca + " ligado.");
    }
}

// --- Classe Carro (Subclasse) ---
class Carro extends Veiculo {

    public Carro(String marca) {
        super(marca);
    }

    // Sobrescrita do método ligar()
    @Override
    public void ligar() {
        System.out.println("Carro " + marca + " ligado com a chave presencial.");
    }

    // Sobrecarga: ligar(boolean chavePresencial)
    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Carro " + marca + " ligando com chave presencial.");
        } else {
            System.out.println("Carro " + marca + " ligando com chave física.");
        }
    }
}

// --- Classe Moto (Subclasse) ---
class Moto extends Veiculo {

    public Moto(String marca) {
        super(marca);
    }

    // Sobrescrita do método ligar()
    @Override
    public void ligar() {
        System.out.println("Moto " + marca + " ligada no botão.");
    }

    // Sobrecarga: ligar(boolean chavePresencial)
    public void ligar(boolean chavePresencial) {
        if (chavePresencial) {
            System.out.println("Moto " + marca + " ligando por aproximação.");
        } else {
            System.out.println("Moto " + marca + " ligando com a chave.");
        }
    }
}

// --- Classe Main para testes ---
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota");
        Moto minhaMoto = new Moto("Honda");

        System.out.println("--- Testes Carro ---");
        meuCarro.ligar(); // Sobrescrita
        meuCarro.ligar(true); // Sobrecarga (True)
        meuCarro.ligar(false); // Sobrecarga (False)

        System.out.println("\n--- Testes Moto ---");
        minhaMoto.ligar(); // Sobrescrita
        minhaMoto.ligar(true); // Sobrecarga (True)
        minhaMoto.ligar(false); // Sobrecarga (False)
    }
}
