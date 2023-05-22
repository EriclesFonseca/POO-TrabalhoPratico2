import java.time.LocalDate;

/**
 * A classe Grupo representa um grupo no sistema.
 * Ela possui um id, uma data e um estado.
 */
public class Grupo {
    private int id;
    private LocalDate data;
    private String estado;

    /**
     * Cria uma instância de Grupo com o ID, data e estado fornecidos.
     *
     * @param id     o identificador do grupo
     * @param data   a data do grupo
     * @param estado o estado do grupo
     */
    public Grupo(int id, LocalDate data, String estado) {
        this.id = id;
        this.data = data;
        this.estado = estado;
    }

    /**
     * Obtém o identificador do grupo.
     *
     * @return o identificador do grupo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do grupo.
     *
     * @param id o identificador do grupo a ser definido
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a data do grupo.
     *
     * @return a data do grupo
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data do grupo.
     *
     * @param data a data do grupo a ser definida
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Obtém o estado do grupo.
     *
     * @return o estado do grupo
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o estado do grupo.
     *
     * @param estado o estado do grupo a ser definido
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
