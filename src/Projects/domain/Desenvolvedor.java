package Projects.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo em Deselvolvedor");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
