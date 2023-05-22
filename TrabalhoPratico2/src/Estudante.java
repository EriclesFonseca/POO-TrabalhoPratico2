/**
 * A classe Estudante representa um estudante no sistema Isecmarini.
 * Ela estende a classe Isecmarini e adiciona informações específicas de um estudante, como código, curso, ano de matrícula e status de vida como estudante.
 */
public class Estudante extends Isecmarini {
    private int codigo;
    private String curso;
    private int anoMatricula;
    private vidaEstudante status;

    /**
     * Cria uma instância de Estudante com as informações fornecidas.
     *
     * @param username      o nome de usuário do estudante
     * @param email         o endereço de e-mail do estudante
     * @param nome          o nome completo do estudante
     * @param apelido       o apelido do estudante
     * @param alcunha       a alcunha do estudante
     * @param password      a senha do estudante
     * @param codigo        o código do estudante
     * @param curso         o curso em que o estudante está matriculado
     * @param anoMatricula  o ano de matrícula do estudante
     * @param status        o status de vida do estudante
     */
    public Estudante(String username, String email, String nome, String apelido, String alcunha, String password,
                     int codigo, String curso, int anoMatricula, vidaEstudante status) {
        super(username, email, nome, apelido, alcunha, password, true);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.status = status;
    }

    /**
     * Obtém o código do estudante.
     *
     * @return o código do estudante
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do estudante.
     *
     * @param codigo o código do estudante a ser definido
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o curso em que o estudante está matriculado.
     *
     * @return o curso do estudante
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o curso em que o estudante está matriculado.
     *
     * @param curso o curso do estudante a ser definido
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Obtém o ano de matrícula do estudante.
     *
     * @return o ano de matrícula do estudante
     */
    public int getAnoMatricula() {
        return anoMatricula;
    }

    /**
     * Define o ano de matrícula do estudante.
     *
     * @param anoMatricula o ano de matrícula do estudante a ser definido
     */
    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    /**
     * Obtém o status de vida do estudante.
     *
     * @return o status de vida do estudante
     */
    public vidaEstudante getStatus() {
        return status;
    }

    /**
     * Define o status de vida do estudante.
     *
     * @param status o status de vida do estudante a ser definido
     */
    public void setStatus(vidaEstudante status) {
        this.status = status;
    }
}
