import java.util.Scanner;

public class PedradaDigital {
    private Isecmarini[] comunidade;
    private Pedrada[] pedradas;
    private Grupo[] grupos;
    private Evento[] eventos;

    /**
     * Verifica se um usuário com o username fornecido está registrado na comunidade.
     *
     * @param username o username a ser verificado
     * @return true se o usuário estiver registrado, false caso contrário
     */
    private boolean isUserRegistered(String username) {
        for (Isecmarini user : comunidade) {
            if (user != null && user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Realiza o login de um usuário.
     */
    public void signin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o username: ");
        String username = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Erro: Campos obrigatórios não preenchidos");
            return;
        }
        if (isUserRegistered(username)) {
            Isecmarini usuario = getUserByUsername(username);
            if (usuario.getPassword().equals(password)) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("Erro: Senha incorreta");
            }
        } else {
            System.out.println("Erro: Usuário não cadastrado");
        }
    }

    /**
     * Retorna o usuário correspondente ao username fornecido.
     *
     * @param username o username do usuário a ser obtido
     * @return o objeto Isecmarini correspondente ao username, ou null se não encontrado
     */
    private Isecmarini getUserByUsername(String username) {
        for (Isecmarini user : comunidade) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }

    /**
     * Realiza o logout de um usuário.
     *
     * @param username o username do usuário a ser desconectado
     */
    public void signoff(String username) {
        System.out.println("Realizando o logout de " + username);
    }

    /**
     * Realiza o cadastro de um novo usuário.
     */
    public void signup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Realizando o cadastro");
        System.out.print("Digite o username: ");
        String username = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o apelido: ");
        String apelido = scanner.nextLine();
        System.out.print("Digite a alcunha: ");
        String alcunha = scanner.nextLine();
        System.out.print("O usuário é visível? (true/false): ");
        boolean visivel = scanner.nextBoolean();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            System.out.println("Erro: Campos obrigatórios não preenchidos");
            return;
        }
        if (isUserRegistered(username)) {
            System.out.println("Erro: Usuário já cadastrado");
            return;
        }


        Isecmarini novoUsuario = null;
        adicionarUsuario(novoUsuario);

        System.out.println("Cadastro realizado com sucesso!");
    }

    /**
     * Adiciona um usuário à comunidade.
     *
     * @param usuario o objeto Isecmarini do usuário a ser adicionado
     */
    private void adicionarUsuario(Isecmarini usuario) {
        for (int i = 0; i < comunidade.length; i++) {
            if (comunidade[i] == null) {
                comunidade[i] = usuario;
                break;
            }
        }
    }
}
