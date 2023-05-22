/**
 * A classe Funcionario é uma classe abstrata que representa um funcionário no sistema Isecmarini.
 * Ela estende a classe Isecmarini e adiciona informações específicas de um funcionário, como unidade organizacional e função.
 */
public abstract class Funcionario extends Isecmarini {
    private String unidadeOrganizacional;
    private String função;

    /**
     * Cria uma instância de Funcionario com as informações fornecidas.
     *
     * @param username               o nome de usuário do funcionário
     * @param email                  o endereço de e-mail do funcionário
     * @param nome                   o nome completo do funcionário
     * @param apelido                o apelido do funcionário
     * @param alcunha                a alcunha do funcionário
     * @param password               a senha do funcionário
     * @param visivel                indica se o funcionário está visível no sistema
     * @param unidadeOrganizacional  a unidade organizacional do funcionário
     * @param função                 a função do funcionário
     */
    public Funcionario(String username, String email, String nome, String apelido, String alcunha,
                       String password, boolean visivel, String unidadeOrganizacional, String função) {
        super(username, email, nome, apelido, alcunha, password, visivel);
        this.unidadeOrganizacional = unidadeOrganizacional;
        this.função = função;
    }

    /**
     * Obtém a unidade organizacional do funcionário.
     *
     * @return a unidade organizacional do funcionário
     */
    public String getUnidadeOrganizacional() {
        return unidadeOrganizacional;
    }

    /**
     * Define a unidade organizacional do funcionário.
     *
     * @param unidadeOrganizacional a unidade organizacional do funcionário a ser definida
     */
    public void setUnidadeOrganizacional(String unidadeOrganizacional) {
        this.unidadeOrganizacional = unidadeOrganizacional;
    }

    /**
     * Obtém a função do funcionário.
     *
     * @return a função do funcionário
     */
    public String getFunção() {
        return função;
    }

    /**
     * Define a função do funcionário.
     *
     * @param função a função do funcionário a ser definida
     */
    public void setFunção(String função) {
        this.função = função;
    }
}
