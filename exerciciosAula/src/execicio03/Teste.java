package execicio03;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite sua login");
            String usuario = leitor.nextLine();

            System.out.println("Digite sua senha");
            String senha = leitor.nextLine();

            Login login = new Login(usuario, senha);

            if (login.fazerLogin(usuario, senha)){
                System.out.println("Login realizado");
            } else {
                System.out.println("Login inválido");
            }
    }

}
