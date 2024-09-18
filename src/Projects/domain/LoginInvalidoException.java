package Projects.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        System.out.println("Login Inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
