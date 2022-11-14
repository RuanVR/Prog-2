package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Carga " + this.carga);
        System.out.println("Ponta " + this.ponta);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, tampada");
        }
        else{
            System.out.println("Rabiscando");
        }
    }


    public void tampar(){

        this.tampada = true;
    }

    public void destampar(){

        this.tampada = false;
    }
}