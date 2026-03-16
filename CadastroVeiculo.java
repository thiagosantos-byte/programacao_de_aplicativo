class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + portas);
    }
}

// Classe Moto que herda de Veiculo
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2020, 4);
        Moto moto = new Moto("Honda", 2018, 250);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
    }
}
