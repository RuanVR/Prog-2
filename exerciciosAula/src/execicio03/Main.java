package execicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Cadastre seu login");
        String usuario = leitor.nextLine();

        System.out.println("Cadastre sua senha");
        String senha = leitor.nextLine();

        Login l = new Login(usuario, senha);

        Teste t = new Teste();

    }
}
