package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p){ //CONSTRUTOR
        this.tampar();
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void status(){

        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor " + this.cor);
        System.out.println("Tampada " + this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
