public class PedradaFoto extends Pedrada {
    private String nomeFicheiro;
    private String legenda;

    public PedradaFoto(int id, String username, long carimbotempo, int gostos, Comentario[] comentarios, Isecmarini isecmarini, String nomeFicheiro, String legenda) {
        super(id, username, carimbotempo, gostos, comentarios);
        this.nomeFicheiro = nomeFicheiro;
        this.legenda = legenda;
    }

    /**
     * Retorna o nome do arquivo da foto.
     *
     * @return o nome do arquivo da foto
     */
    public String getNomeFicheiro() {
        return nomeFicheiro;
    }

    /**
     * Retorna a legenda da foto.
     *
     * @return a legenda da foto
     */
    public String getLegenda() {
        return legenda;
    }
}
