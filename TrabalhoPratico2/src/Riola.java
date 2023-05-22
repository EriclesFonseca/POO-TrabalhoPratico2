public class Riola {
    private Pedrada[] pedradas;

    /**
     * Cria uma instância de Riola.
     */
    public Riola() {
        pedradas = new Pedrada[0];
    }

    /**
     * Adiciona uma pedrada à lista de pedradas.
     *
     * @param pedrada A pedrada a ser adicionada.
     */
    public void addPedrada(Pedrada pedrada) {
        Pedrada[] novaLista = new Pedrada[pedradas.length + 1];
        for (int i = 0; i < pedradas.length; i++) {
            novaLista[i] = pedradas[i];
        }
        novaLista[novaLista.length - 1] = pedrada;
        pedradas = novaLista;
    }

    public void show() {
        for (Pedrada pedrada : pedradas) {
            pedrada.display();
        }
    }
}
