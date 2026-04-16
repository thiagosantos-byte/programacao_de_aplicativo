// 1. Classe Abstrata Forma
abstract class Forma {
    // Método abstrato que será sobrescrito
    abstract double calcularArea();

    // Sobrecarga: calcularArea com dois parâmetros
    double calcularArea(double valor1, double valor2) {
        return valor1 * valor2;
    }
}

// 2. Classe Quadrado (Sobrescreve calcularArea)
class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        System.out.print("Área do Quadrado: ");
        return lado * lado;
    }
}

// 3. Classe Retangulo (Sobrescreve calcularArea)
class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        System.out.print("Área do Retângulo: ");
        return base * altura;
    }
}

// 4. Teste no Main.java
public class Main {
    public static void main(String[] args) {
        // Testando Sobrescrita (Polimorfismo)
        Forma f1 = new Quadrado(5.0);
        Forma f2 = new Retangulo(4.0, 6.0);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());
        System.out.println("----------------");

        // Testando Sobrecarga (calculando área com parâmetros diretos)
        // Usando a instância de Retangulo para acessar o método sobrecarregado
        System.out.println("Cálculo sobrecarregado (5x10): " + f2.calcularArea(5.0, 10.0));
    }
}
