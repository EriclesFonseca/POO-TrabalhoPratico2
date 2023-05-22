public class PedradaMensagem extends Pedrada {
    private String mensagem;

    public PedradaMensagem(int id, String username, long carimbotempo, int gostos, Comentario[] comentarios, Isecmarini isecmarini, String mensagem) {
        super(id, username, carimbotempo, gostos, comentarios);
        this.mensagem = mensagem;
    }

    /**
     * Retorna o texto da mensagem da pedrada.
     *
     * @return o texto da mensagem da pedrada
     */
    public String getTexto() {
        return mensagem;
    }
}
