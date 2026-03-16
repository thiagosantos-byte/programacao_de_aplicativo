// Classe base Produto
class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}

// Classe Eletronico que herda de Produto
class Eletronico extends Produto {
    private int garantia; // em meses

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Garantia: " + garantia + " meses");
    }
}

// Classe Alimento que herda de Produto
class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Data de Validade: " + dataValidade);
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Smartphone", 2500.00, 12);
        Alimento pao = new Alimento("Pão Integral", 8.50, "20/03/2026");

        System.out.println("Informações do Produto Eletrônico:");
        celular.mostrarProduto();

        System.out.println("\nInformações do Produto Alimento:");
        pao.mostrarProduto();
    }
}
