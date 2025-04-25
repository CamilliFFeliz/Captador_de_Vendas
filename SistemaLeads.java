import java.util.ArrayList;

public class SistemaLeads {

    private ArrayList<Lead> leads = new ArrayList<>();

    public void adicionarLead(String nome, String email, String servicoInteresse, String fonteLead, String qualificacao) {
        Lead lead = new Lead(nome, email, servicoInteresse, fonteLead, qualificacao);
        leads.add(lead);
        System.out.println("Lead " + nome + " adicionado com sucesso!");
    }

    public void listarLeads() {
        if (leads.isEmpty()) {
            System.out.println("Nenhum lead cadastrado.");
        } else {
            System.out.println("\\nLista de Leads:");
            for (int i = 0; i < leads.size(); i++) {
                System.out.println("\\nLead " + (i + 1) + ":");
                leads.get(i).exibirInformacoes();
            }
        }
    }

    public void filtrarPorServico(String servico) {
        System.out.println("\\nLeads interessados em " + servico + ":");
        boolean encontrado = false;
        for (Lead lead : leads) {
            if (lead.getServicoInteresse().equalsIgnoreCase(servico)) {
                lead.exibirInformacoes();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum lead encontrado para o serviço " + servico);
        }
    }

    public void atualizarStatusLead(int indiceLead, StatusLead status) {
        if (indiceLead >= 0 && indiceLead < leads.size()) {
            Lead lead = leads.get(indiceLead);
            lead.setStatus(status);
            System.out.println("Lead " + lead.getNome() + " teve seu status atualizado para: " + status);
        } else {
            System.out.println("Lead não encontrado.");
        }
    }

    public void deletarLead(int indiceLead) {
        if (indiceLead >= 0 && indiceLead < leads.size()) {
            Lead lead = leads.remove(indiceLead);
            System.out.println("Lead " + lead.getNome() + " deletado com sucesso!");
        } else {
            System.out.println("Lead não encontrado.");
        }
    }
}
