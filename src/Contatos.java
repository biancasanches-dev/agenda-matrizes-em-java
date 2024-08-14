import java.util.Scanner;

public class Contatos {
    public static void main(String[] args) {
        String[][] contatos = new String[100][3];

        contatos[0] = new String[]{"João", "123456789", "joao@email.com"};
        contatos[1] = new String[]{"Maria", "987654321", "maria@email.com"};
        contatos[2] = new String[]{"José", "456789123", "jose@email.com"};
        contatos[3] = new String[]{"Ana", "654321987", "ana@email.com"};

        listarContatos(contatos);

        menu(contatos);
    }

    public static void menu(String[][] contatos) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n>>>>>>>>> Menu Contato <<<<<<<<<<");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Detalhar Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");

            System.out.println("Digite a opção desejada: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Digite as informações do contato (nome, telefone, email): ");
                    String novoContato = input.nextLine();
                    addContato(contatos, novoContato);
                    break;
                case 2:
                    System.out.println("Digite o telefone do contato que deseja buscar: ");
                    String telefoneBuscar = input.nextLine();
                    detalharContato(contatos, telefoneBuscar);
                    break;
                case 3:
                    System.out.println("Digite o telefone do contato que deseja editar: ");
                    String telefoneEditar = input.nextLine();
                    System.out.println("Digite as novas informações do contato (nome, telefone, email): ");
                    String contatoEditado = input.nextLine();
                    editarContato(contatos, telefoneEditar, contatoEditado);
                    break;
                case 4:
                    System.out.println("Digite o telefone do contato que deseja remover: ");
                    String telefoneRemover = input.nextLine();
                    removerContato(contatos, telefoneRemover);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static boolean verificarContatoExistente(String[][] contatos, String telefone) {
        for (int i = 0; i < contatos.length; i++) {
            String[] contato = contatos[i];
            if (contato[1] != null && contato[1].equals(telefone)) {
                return true;
            }
        }
        return false;
    }

    public static void addContato(String[][] contatos, String contato) {
        String[] contatoInfo = contato.split(", ");
        String telefone = contatoInfo[1];

        if (verificarContatoExistente(contatos, telefone)) {
            System.out.println("Contato já existe!");
            return;
        }

        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i][0] == null) {
                contatos[i] = new String[]{contato};
                break;
            }
        }
    }

    public static void listarContatos(String[][] contatos) {
        System.out.println(">>>>>>>>>Contatos<<<<<<<<<<");
        System.out.println("Id | Nome | Telefone | Email");
        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i][0] != null) {
                System.out.println( i + " | " + contatos[i][0] + " | " + contatos[i][1] + " | " + contatos[i][2]);
            }
        }
    }

    public static void detalharContato(String[][] contatos, String telefone) {
        if (!verificarContatoExistente(contatos, telefone)) {
            System.out.println("Contato não encontrado.");
            return;
        }

        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i][1] != null && contatos[i][1].equals(telefone)) {
                System.out.println(">>>>>>>>>Contato Encontrado<<<<<<<<<<");
                System.out.println("Id | Nome | Telefone | Email");
                System.out.println( i + " | " + contatos[i][0] + " | " + contatos[i][1] + " | " + contatos[i][2]);
                break;
            }
        }
    }

    public static void editarContato(String[][] contatos, String telefone, String contato) {
        String[] contatoInfo = contato.split(", ");

        if (!verificarContatoExistente(contatos, telefone)) {
            System.out.println("Contato não encontrado.");
            return;
        }

        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i][1] != null && contatos[i][1].equals(telefone)) {
                contatos[i] = contatoInfo;

                break;
            }
        }
    }

    public static void removerContato(String[][] contatos, String telefone) {
        if (!verificarContatoExistente(contatos, telefone)) {
            System.out.println("Contato não encontrado.");
            return;
        }

        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i][1] != null && contatos[i][1].equals(telefone)) {
                contatos[i] = null;
                System.out.println("Contato removido com sucesso.");
                break;
            }
        }
    }

}