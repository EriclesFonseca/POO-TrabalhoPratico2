public class PedradaEvento extends Pedrada {
    private TipoEvento tipo;
    private String data;
    private String local;
    private String entrada;
    private String status;

    /**
     * Construtor da classe PedradaEvento.
     *
     * @param id           O identificador da pedrada.
     * @param username     O nome de usuário associado à pedrada.
     * @param carimbotempo O carimbo de tempo da pedrada.
     * @param gostos       O número de gostos da pedrada.
     * @param comentarios  O array de comentários da pedrada.
     * @param isecmarini   O objeto Isecmarini associado à pedrada.
     * @param tipo         O tipo do evento da pedrada.
     * @param data         A data do evento da pedrada.
     * @param local        O local do evento da pedrada.
     * @param entrada      As informações sobre a entrada do evento da pedrada.
     * @param status       O status do evento da pedrada.
     */
    public PedradaEvento(int id, String username, long carimbotempo, int gostos,
                         Comentario[] comentarios, Isecmarini isecmarini, TipoEvento tipo, String data,
                         String local, String entrada, String status) {

        super(id, username, carimbotempo, gostos, comentarios);
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    /**
     * Obtém a data do evento.
     *
     * @return A data do evento.
     */
    public String getData() {
        return data;
    }

    /**
     * Obtém o status do evento.
     *
     * @return O status do evento.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Obtém o local do evento.
     *
     * @return O local do evento.
     */
    public String getLocal() {
        return local;
    }

    public TipoEvento getTipo() {
        return tipo;
    }
}
