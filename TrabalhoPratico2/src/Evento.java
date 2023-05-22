/**
 * A classe Evento representa um evento no sistema.
 * Ela possui um id, um nome e um tipo de evento.
 */
public class Evento {
    private int id;
    private String nome;
    private TipoEvento tipo;

    /**
     * Cria uma instância de Evento com o ID, nome e tipo fornecidos.
     *
     * @param id   o identificador do evento
     * @param nome o nome do evento
     * @param tipo o tipo de evento
     */
    public Evento(int id, String nome, TipoEvento tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    /**
     * Obtém o identificador do evento.
     *
     * @return o identificador do evento
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do evento.
     *
     * @param id o identificador do evento a ser definido
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do evento.
     *
     * @return o nome do evento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do evento.
     *
     * @param nome o nome do evento a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o tipo de evento.
     *
     * @return o tipo de evento
     */
    public TipoEvento getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de evento.
     *
     * @param tipo o tipo de evento a ser definido
     */
    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
}
