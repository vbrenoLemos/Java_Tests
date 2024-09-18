package Projects.tests;

import Projects.domain.Desenvolvedor;
import Projects.domain.Funcionario;
import Projects.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Breno", 1252);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Diego", 1234);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
