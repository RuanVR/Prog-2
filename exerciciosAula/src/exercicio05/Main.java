package exercicio05;

public class Main {
    public static void main(String[] args) throws ContaException {
        ContaBancaria nova_Conta = new ContaBancaria(1000, 500);


        nova_Conta.sacar(1501);

        nova_Conta.depositar(1001);

    }
}
