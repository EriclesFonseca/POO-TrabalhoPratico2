import java.util.Date;

/**
 * A classe Comentario representa um comentário em um sistema de interação.
 * Possui texto, data e hora de criação, quantidade de "gostos" e uma referência para a entidade Pedrada.
 */
public class Comentario {
    private String texto;
    private Date datahora;
    private int gostos;
    private Pedrada pedrada;

    /**
     * Cria uma instância de Comentario com o texto fornecido e a referência para a entidade Pedrada.
     * A data e hora de criação são definidas automaticamente como a data e hora atual.
     *
     * @param texto o texto do comentário
     */
    public Comentario(String texto) {
        this.texto = texto;
        this.datahora = new Date();
        this.gostos = 0;
        this.pedrada = pedrada;
    }

    /**
     * Responde ao comentário atual, retornando um novo objeto Comentario como resposta.
     *
     * @return um novo objeto Comentario como resposta ao comentário atual
     */
    public Comentario responder(String texto) {
    Comentario comentario=new Comentario(texto);
    return comentario;
    }

    /**
     * Incrementa a contagem de "gostos" do comentário.
     */
    public void gosto() {
        gostos++;
    }

    /**
     * Decrementa a contagem de "gostos" do comentário.
     */
    public void tragosto() {
        gostos--;
    }

    public String getTexto() {
        return texto;
    }
}
