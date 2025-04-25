import java.util.Date;

public class Lead {
    private String nome;
    private String email;
    private StatusLead status;
    private String servicoInteresse;
    private Date dataEntrada;
    private String fonteLead;
    private String qualificacao;

    public Lead(String nome, String email, String servicoInteresse, String fonteLead, String qualificacao) {
        this.nome = nome;
        this.email = email;
        this.status = StatusLead.NOVO;
        this.servicoInteresse = servicoInteresse;
        this.fonteLead = fonteLead;
        this.qualificacao = qualificacao;
        this.dataEntrada = new Date();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public StatusLead getStatus() {
        return status;
    }

    public void setStatus(StatusLead status) {
        this.status = status;
    }

    public String getServicoInteresse() {
        return servicoInteresse;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public String getFonteLead() {
        return fonteLead;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Status: " + status);
        System.out.println("Serviço de Interesse: " + servicoInteresse);
        System.out.println("Fonte do Lead: " + fonteLead);
        System.out.println("Qualificação: " + qualificacao);
        System.out.println("Data de Entrada: " + dataEntrada);
    }
}

