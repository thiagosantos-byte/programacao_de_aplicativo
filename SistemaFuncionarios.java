// Funcionario.java - Classe Base
class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método a ser sobrescrito
    public double calcularSalario() {
        return this.salario;
    }

    // Sobrecarga de método
    public double calcularSalario(double bonus) {
        return this.salario + bonus;
    }

    public String getNome() {
        return nome;
    }
}

// Gerente.java - Subclasse
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Tarefa: Sobrescrita (Override) - Gerente ganha 20% de bônus automático
    @Override
    public double calcularSalario() {
        return this.salario * 1.20;
    }

    // Tarefa: Sobrecarga (Overload) - calcularSalario(double bonus)
    @Override
    public double calcularSalario(double bonus) {
        return (this.salario * 1.20) + bonus;
    }
}

// Estagiario.java - Subclasse
class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    // Tarefa: Sobrescrita (Override) - Estagiário tem regras específicas
    @Override
    public double calcularSalario() {
        return this.salario; // Salário base fixo
    }
    
    // Tarefa: Sobrecarga (Overload) - Estagiário com bônus
    @Override
    public double calcularSalario(double bonus) {
        return this.salario + (bonus / 2); // Bônus reduzido
    }
}

// Main.java - Teste Completo
public class Main {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("Ana Silva", 5000.0);
        Funcionario e1 = new Estagiario("Pedro Souza", 1500.0);

        System.out.println("--- Sistema de Funcionários ---");
        
        // Testando Sobrescrita
        System.out.println("Gerente " + g1.getNome() + ": " + g1.calcularSalario());
        System.out.println("Estagiário " + e1.getNome() + ": " + e1.calcularSalario());
        
        System.out.println("\n--- Com Bônus (Sobrecarga) ---");
        
        // Testando Sobrecarga (bônus de 500)
        System.out.println("Gerente " + g1.getNome() + " com bônus: " + g1.calcularSalario(500));
        System.out.println("Estagiário " + e1.getNome() + " com bônus: " + e1.calcularSalario(500));
    }
}
