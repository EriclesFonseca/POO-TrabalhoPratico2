/**
 * Ela estende a classe Estudante e adiciona informações relacionadas ao trabalho.
 */
public class Alumni extends Estudante {
    private String trabalho;
    private String função;
    private String email;

    /**
     * Cria uma instância de Alumni.
     *
     * @param codigo        o código do aluno
     * @param curso         o curso em que o aluno estava matriculado
     * @param anoMatricula  o ano de matrícula do aluno
     * @param status        o status de vida do aluno
     * @param trabalho      o local de trabalho do ex-estudante
     * @param função        a função ocupada pelo ex-estudante no trabalho
     * @param email         o endereço de e-mail do ex-estudante
     */
    public Alumni(int codigo, String curso, int anoMatricula, vidaEstudante status,
                  String trabalho, String função, String email) {
        super("", "", "", "", "", "", codigo, curso, anoMatricula, status);
        this.trabalho = trabalho;
        this.função = função;
        this.email = email;
    }

    /**
     * Obtém o local de trabalho do ex-estudante.
     *
     * @return o local de trabalho
     */
    public String getTrabalho() {
        return trabalho;
    }

    /**
     * Define o local de trabalho do ex-estudante.
     *
     * @param trabalho o local de trabalho a ser definido
     */
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    /**
     * Obtém a função ocupada pelo ex-estudante no trabalho.
     *
     * @return a função ocupada
     */
    public String getFunção() {
        return função;
    }

    /**
     * Define a função ocupada pelo ex-estudante no trabalho.
     *
     * @param função a função ocupada a ser definida
     */
    public void setFunção(String função) {
        this.função = função;
    }

    /**
     * Obtém o endereço de e-mail do ex-estudante.
     *
     * @return o endereço de e-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de e-mail do ex-estudante.
     *
     * @param email o endereço de e-mail a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
