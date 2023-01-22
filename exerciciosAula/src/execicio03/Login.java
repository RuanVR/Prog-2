package execicio03;

public class Login {
    private String usuario;
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String _usuario, String _senha) {

        try {
            if (!this.usuario.equals(_usuario)){
                throw new Exception("Usuário incorreto");
            }
            if (!this.senha.equals(_senha)){
                throw new Exception("Senha incorreta");
            }
        } catch (Exception e) {
            System.out.println("Erro");
            return false;
        }

        return true;
    }
}
