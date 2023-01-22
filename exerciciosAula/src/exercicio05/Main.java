package exercicio05;

public class Main {
    public static void main(String[] args) {
        ContaBancaria nova_Conta = new ContaBancaria(1000, 500);

        try{
            nova_Conta.sacar(1001);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }

        try{
            nova_Conta.depositar(999);
        } catch (ContaException e){
            System.out.println(e.getMessage());
        }


    }
}
