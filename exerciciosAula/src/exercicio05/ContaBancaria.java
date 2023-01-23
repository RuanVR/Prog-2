package exercicio05;

public class ContaBancaria {
    private double saldo; // Determina o saldo da conta.
    private double limite; // Determina o limite de crédito do cheque especial.

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoComLimite() {
        return saldo + limite;
    }

    public boolean sacar(double valor) throws ContaException {

        try {
            if ((getSaldoComLimite() - valor > 0) || (valor < 500)) {
                saldo = saldo - valor;
                return true;
            }

            if (getSaldoComLimite() - valor < 0) {
                throw new ContaException("Saldo com limite insuficiente");
            } else if (valor > 500) {
                throw new ContaException("Valor de saque superior a 500");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public void depositar(double valor) throws ContaException {

        try {
            if (valor > 1000){
                throw new ContaException("Valor de deposito superior a 1000");
            } else {
                saldo = saldo + valor;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

