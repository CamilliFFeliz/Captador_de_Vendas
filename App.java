import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaLeads sistemaLeads = new SistemaLeads();

        int opcao;
        do {
            System.out.println("\\n=== Gerenciamento de Leads ===");
            System.out.println("1. Adicionar Lead");
            System.out.println("2. Listar Leads");
            System.out.println("3. Filtrar Leads por Serviço");
            System.out.println("4. Atualizar Status Lead");
            System.out.println("5. Deletar Lead");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do lead: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do lead: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite o serviço de interesse do lead: ");
                    String servicoInteresse = scanner.nextLine();
                    System.out.print("De onde o lead veio (ex: Redes Sociais, Indicação): ");
                    String fonteLead = scanner.nextLine();
                    System.out.print("Qualificação do lead (Alto, Médio, Baixo): ");
                    String qualificacao = scanner.nextLine();
                    sistemaLeads.adicionarLead(nome, email, servicoInteresse, fonteLead, qualificacao);
                    break;
                case 2:
                    sistemaLeads.listarLeads();
                    break;
                case 3:
                    System.out.print("Digite o serviço para filtrar os leads: ");
                    String filtroServico = scanner.nextLine();
                    sistemaLeads.filtrarPorServico(filtroServico);
                    break;
                case 4:
                    System.out.print("Digite o índice do lead para atualizar: ");
                    int indiceStatus = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo status (NOVO, EM_PROGRESSO, FECHADO): ");
                    String statusStr = scanner.nextLine();
                    StatusLead status = StatusLead.valueOf(statusStr.toUpperCase());
                    sistemaLeads.atualizarStatusLead(indiceStatus - 1, status);
                    break;
                case 5:
                    System.out.print("Digite o índice do lead para deletar: ");
                    int indiceDeletar = scanner.nextInt();
                    sistemaLeads.deletarLead(indiceDeletar - 1);
                    break;
                case 6:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
