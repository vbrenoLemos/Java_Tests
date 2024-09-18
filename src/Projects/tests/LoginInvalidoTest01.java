package Projects.tests;

import Projects.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void logar() throws LoginInvalidoException {
        try (Scanner sc = new Scanner(System.in)) {
            String usernameDB = "Breno";
            String senhaDB = "bellelinda123";
            System.out.print("Digite seu usuario: ");
            String username = sc.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (usernameDB.equals(username)) {
                if (!senhaDB.equals(senha)) {
                    throw new LoginInvalidoException("Senha Inválida");
                }
                System.out.println("Login Efetuado");
            } else {
                System.out.println("Usuario não consta no DB");
            }
        }
    }
}
