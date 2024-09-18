package Projects.domain;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcularBonus() {
        this.salario = this.salario  + this.salario * 0.2;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo em Gerente");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
