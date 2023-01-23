package exercicio01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculo {
    private int dividendo;
    private int divisor;
    private int resultado;

    public void Resultado (){
        Scanner leitor = new Scanner(System.in);
        try{
            System.out.println("Digite um numero para ser o dividendo");
            dividendo = leitor.nextInt();

            System.out.println("Digite um numero para ser o divisor");
            divisor = leitor.nextInt();

            resultado = dividendo/divisor;

            System.out.println("Resultado: " + resultado);

        } catch(ArithmeticException e){
            System.out.println("Divisao por zero");
        } catch(InputMismatchException e){
            System.out.println("Valor nao numerico");
        }

    }
}