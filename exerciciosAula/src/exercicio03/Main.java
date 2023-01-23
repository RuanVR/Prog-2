package exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Cadastrando usuario
        System.out.println("Cadastre seu login");
        String usuario = leitor.nextLine();

        System.out.println("Cadastre sua senha");
        String senha = leitor.nextLine();

        Login novo_login = new Login(usuario, senha);

        //Testando

        System.out.println("Digite sua login");
        String usuario_teste = leitor.nextLine();

        System.out.println("Digite sua senha");
        String senha_teste = leitor.nextLine();

        if (novo_login.fazerLogin(usuario_teste, senha_teste)){
            System.out.println("Login realizado");
        } else {
            System.out.println("Login invalido");
        }

    }
}
