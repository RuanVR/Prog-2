package exercicio02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {
    private int[] vetor = new int[10];
    private int valor;
    private int i = 0;

    public void Valores(){
        Scanner leitor = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Digite um valor");
                valor = leitor.nextInt();
                if (valor == 0){
                    vetor[i] = valor;
                    break;
                } else {
                    vetor[i] = valor;
                    i++;
                }

                if (i > 10){
                    throw new ArrayIndexOutOfBoundsException("Posições indisponiveis");
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                break;
            } catch(InputMismatchException e){
                System.out.println("Valores nao numericos");
            }
        }

        System.out.println("Os valores escolhidos foram:");
        for (int j = 0; j < i; j++){
            System.out.println("Posicao " + (j+1) + ": " + vetor[j]);
        }

    }
}
