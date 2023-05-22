import java.util.TreeMap;

/**
 * A classe Isecmarini é a classe base que representa um usuário no sistema Isecmarini.
 * Ela contém informações básicas do usuário, como nome, email, apelido, pseudônimo, alcunha e interesses.
 */
public abstract class Isecmarini {
    private TreeMap<String, Isecmarini> book;
    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String pseudonimo;
    private String alcunha;
    private String password;
    private boolean visivel;
    private Interesse[] interesses;

    /**
     * Cria uma instância de Isecmarini com as informações fornecidas.
     *
     * @param username    o nome de usuário do usuário
     * @param email       o email do usuário
     * @param nome        o nome do usuário
     * @param apelido     o apelido do usuário
     * @param pseudonimo  o pseudônimo do usuário
     * @param alcunha     a alcunha do usuário
     * @param password    a senha do usuário
     * @param visivel     a visibilidade do usuário
     * @param interesses  os interesses do usuário
     */
    public Isecmarini(String username, String email, String nome, String apelido, String pseudonimo,
                      String alcunha, String password, boolean visivel, Interesse[] interesses) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.pseudonimo = pseudonimo;
        this.alcunha = alcunha;
        this.password = password;
        this.visivel = visivel;
        this.interesses = interesses;
    }
    public Isecmarini(String username, String email, String nome, String apelido, String alcunha, String password, boolean visivel) {
        // Implementação específica para subclasses
    }

    /**
     * Redefine a senha do usuário.
     *
     * @param oldPass a senha antiga
     * @param newPass a nova senha
     */
    public void resetPassword(String oldPass, Isecmarini newPass) {
        if (book.containsValue(oldPass)) {
            book.put(oldPass, newPass);
            System.out.println("Senha redefinida com sucesso!");
        } else {
            System.out.print("Não foi possível redefinir a senha, senha não encontrada.");
        }
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return a senha do usuário
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha do usuário.
     *
     * @param password a senha do usuário
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Exibe o perfil do usuário.
     */
    public void verPerfil() {
        System.out.println("Perfil de " + nome + ":");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Apelido: " + apelido);
        System.out.println("Pseudônimo: " + pseudonimo);
        System.out.println("Alcunha: " + alcunha);
        System.out.println("Interesses:");
        for (Interesse interesse : interesses) {
            System.out.println("- " + interesse.getDescrição());
        }
    }

    /**
     * Define a visibilidade do usuário.
     *
     * @param visivel a visibilidade do usuário
     */
    public void definirVisibilidade(boolean visivel) {
        this.visivel = visivel;
    }

    /**
     * Verifica se um usuário está registrado com o nome de usuário fornecido.
     *
     * @param username o nome de usuário a ser verificado
     * @return true se o usuário estiver registrado, false caso contrário
     */
    public boolean isUserRegistered(String username) {
        Isecmarini[] marins = new Isecmarini[0];
        for (Isecmarini user : marins) {
            if (user != null && user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtém o nome de usuário do usuário.
     *
     * @return o nome de usuário do usuário
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define o nome de usuário do usuário.
     *
     * @param username o nome de usuário do usuário
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Salva um usuário.
     *
     * @param usuario o usuário a ser salvo
     */
    public void saveUser(Isecmarini usuario) {
        Isecmarini[] marins = new Isecmarini[0];
        for (int i = 0; i < marins.length; i++) {
            if (marins[i] == null) {
                marins[i] = usuario;
                return;
            }
        }
        Isecmarini[] novaLista = new Isecmarini[marins.length + 1];
        System.arraycopy(marins, 0, novaLista, 0, marins.length);
        novaLista[marins.length] = usuario;
        marins = novaLista;
    }

    /**
     * Obtém um usuário pelo nome de usuário.
     *
     * @param username o nome de usuário do usuário a ser obtido
     * @return o usuário correspondente ao nome de usuário fornecido, ou null se não encontrado
     */
    public Isecmarini getUserByUsername(String username) {
        Isecmarini[] marins = new Isecmarini[0];
        for (Isecmarini user : marins) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Obtém o nome do usuário.
     *
     * @return o nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do usuário.
     *
     * @param nome o nome do usuário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o apelido do usuário.
     *
     * @return o apelido do usuário
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Define o apelido do usuário.
     *
     * @param apelido o apelido do usuário
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * Obtém a alcunha do usuário.
     *
     * @return a alcunha do usuário
     */
    public String getAlcunha() {
        return alcunha;
    }

    /**
     * Define a alcunha do usuário.
     *
     * @param alcunha a alcunha do usuário
     */
    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    /**
     * Define a visibilidade do usuário.
     *
     * @param visivel a visibilidade do usuário
     */
    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }
}
