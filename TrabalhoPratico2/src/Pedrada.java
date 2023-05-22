public class Pedrada {
    private int id;
    private String username;
    private long carimbotempo;
    private int gostos;
    private Comentario[] comentarios;
    private Isecmarini isecmarini;

    public Pedrada(int id, String username, long carimbotempo, int gostos, Comentario[] comentarios) {
        this.id = id;
        this.username = username;
        this.carimbotempo = carimbotempo;
        this.gostos = gostos;
        this.comentarios = comentarios;
        this.isecmarini = isecmarini;
    }

    /**
     * Incrementa o contador de gostos da Pedrada.
     */
    public void gosto() {
        gostos++;
    }

    /**
     * Decrementa o contador de gostos da Pedrada.
     */
    public void tragosto() {
        gostos--;
    }

    /**
     * Retorna um comentário específico associado à Pedrada.
     *
     * @return o comentário específico
     */
    public Comentario masriola(String comentarios) {
       Comentario riola=new Comentario(comentarios);
       return riola;
    }

    /**
     * Retorna o carimbo de tempo da Pedrada.
     *
     * @return o carimbo de tempo da Pedrada
     */
    public long getCarimboTempo() {
        return carimbotempo;
    }

    /**
     * Exibe as informações da Pedrada.
     */
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Carimbo de Tempo: " + carimbotempo);
        System.out.println("Gostos: " + gostos);
        System.out.println("Comentários:");

        for (Comentario comentario : comentarios) {
            System.out.println("- " + comentario.getTexto());
        }
    }

}
