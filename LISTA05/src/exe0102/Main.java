package exe0102;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("ruan", 20,1.80f);

        p.apresenta();

        Agenda ag[] = new Agenda[10];
        ag[0].armazenaPessoa("a", 1, 1f);
        ag[1].armazenaPessoa("b", 2, 2f);
        ag[2].armazenaPessoa("c", 3, 3f);
        ag[3].armazenaPessoa("d", 4, 4f);

    }
}
