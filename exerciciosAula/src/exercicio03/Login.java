package exercicio03;

public class Login {
    private String usuario;
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        setSenha(senha);
    }

    public boolean fazerLogin(String _usuario, String _senha) {

        try {
            if (!usuario.equals(_usuario)){
                throw new Exception("Usuario incorreto");
            }
            if (!senha.equals(_senha)){
                throw new Exception("Senha incorreta");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
