import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor implements ModeradorGrupo {
    private String área;
    private String grau;
    private String departamento;
    private List<String> membros;
    private List<String> membrosMudos;

    /**
     * Construtor da classe Professor.
     *
     * @param área         a área de atuação do professor
     * @param grau         o grau de formação do professor
     * @param departamento o departamento ao qual o professor pertence
     */
    public Professor(String área, String grau, String departamento) {
        this.área = área;
        this.grau = grau;
        this.departamento = departamento;
        this.membros = new ArrayList<>();
        this.membrosMudos = new ArrayList<>();
    }

    /**
     * Envia uma mensagem para os colegas do grupo.
     */
    public void mandarColegas() {
        System.out.println("Enviando mensagem para colegas.");
        for (String colega : membros) {
            System.out.println("Mensagem enviada para: " + colega);
        }
    }

    /**
     * Cria um novo grupo.
     */
    @Override
    public void criar() {
        System.out.println("Criando um novo grupo.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do grupo: ");
        String nomeGrupo = scanner.nextLine();
        System.out.print("Digite a descrição do grupo: ");
        String descricaoGrupo = scanner.nextLine();
        System.out.println("Grupo \"" + nomeGrupo + "\" criado com sucesso!");
    }

    /**
     * Apaga um grupo.
     */
    @Override
    public void apagar() {
        Scanner leitura = new Scanner(System.in);
        String choice = leitura.nextLine();
        System.out.println("Deseja mesmo apagar o grupo S/N: ");
        if (choice.equalsIgnoreCase("S")) {
            System.out.println("Apagando um grupo...");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o nome do grupo a ser apagado: ");
            String nomeGrupo = scanner.nextLine();
            System.out.println("Grupo \"" + nomeGrupo + "\" apagado com sucesso!");
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.print("  ");
        }
    }

    /**
     * Adiciona um membro ao grupo.
     */
    @Override
    public void adicionarMembro() {
        System.out.println("Adicionando um membro ao grupo.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do membro a ser adicionado: ");
        String nomeMembro = scanner.nextLine();
        System.out.println("Membro \"" + nomeMembro + "\" adicionado ao grupo com sucesso!");
    }

    /**
     * Silenciar um membro do grupo.
     */
    public void muteMembro() {
        System.out.println("Silenciando um membro do grupo.");
        if (membros.size() > 0) {
            System.out.println("Membros disponíveis para silenciar:");
            for (int i = 0; i < membros.size(); i++) {
                System.out.println(i + 1 + ". " + membros.get(i));
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nmr do membro a ser silenciado: ");
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= membros.size()) {
                String membroMudo = membros.get(escolha - 1);
                membrosMudos.add(membroMudo);
                membros.remove(escolha - 1);
                System.out.println("Membro \"" + membroMudo + "\" silenciado com sucesso!");
            } else {
                System.out.println("Escolha inválida. Nenhum membro foi silenciado.");
            }
        } else {
            System.out.println("Não tem membros no grupo para silenciar.");
        }
    }

    /**
     * Remove um membro do grupo.
     */
    @Override
    public void removerMembro() {
        System.out.println("Removendo um membro do grupo.");
        if (membros.size() > 0) {
            System.out.println("Membros disponíveis para remover:");
            for (int i = 0; i < membros.size(); i++) {
                System.out.println(i + 1 + ". " + membros.get(i));
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nmr do membro a ser removido: ");
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= membros.size()) {
                String membroRemovido = membros.get(escolha - 1);
                membros.remove(escolha - 1);
                System.out.println("Membro \"" + membroRemovido + "\" removido com sucesso!");
            } else {
                System.out.println("Escolha inválida. Nenhum membro foi removido.");
            }
        } else {
            System.out.println("Não tem membros no grupo para remover.");
        }
    }

    /**
     * Realiza a moderação das interações do grupo.
     */
    @Override
    public void moderar() {
        System.out.println("Moderação das interações do grupo.");
        if (membros.size() > 0) {
            System.out.println("Membros do grupo:");
            for (int i = 0; i < membros.size(); i++) {
                System.out.println(i + 1 + ". " + membros.get(i));
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nmr do membro para moderar suas interações: ");
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= membros.size()) {
                String membroSelecionado = membros.get(escolha - 1);
                System.out.println("Forma de moderação para o membro \"" + membroSelecionado + "\":");
                System.out.println("1. Bloquear publicação");
                System.out.println("2. Remover publicação");
                System.out.print("Informe o nmr da ação desejada: ");
                int acao = scanner.nextInt();

                switch (acao) {
                    case 1:
                        System.out.println("A publicação do membro \"" + membroSelecionado + "\" foi bloqueada.");
                        break;
                    case 2:
                        System.out.println("A publicação do membro \"" + membroSelecionado + "\" foi removida.");
                        break;
                    default:
                        System.out.println("Ação inválida. Nenhuma ação foi executada.");
                        break;
                }
            } else {
                System.out.println("Escolha inválida. Nenhuma ação de moderação foi executada.");
            }
        } else {
            System.out.println("Não tem membros no grupo para moderar.");
        }
    }
}
