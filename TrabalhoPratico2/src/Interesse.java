/**
 * A classe Interesse representa um interesse no sistema.
 * Ela possui uma descrição.
 */
public class Interesse {
    private String descrição;

    /**
     * Cria uma instância de Interesse com a descrição fornecida.
     *
     * @param descrição a descrição do interesse
     */
    public Interesse(String descrição) {
        this.descrição = descrição;
    }

    /**
     * Obtém a descrição do interesse.
     *
     * @return a descrição do interesse
     */
    public String getDescrição() {
        return descrição;
    }

    /**
     * Define a descrição do interesse.
     *
     * @param descrição a descrição do interesse a ser definida
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getDescriçao() {
        return descrição;
    }
}

