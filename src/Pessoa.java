import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;


    public Pessoa(){}

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone){
        this.nome = nome;

        if (validaCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new RuntimeException("CPF Inválido");
        }

        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if(validaCPF(cpf)) {
            this.cpf = cpf;
            return;
        }
        throw new RuntimeException("CPF Inválido");
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean validaCPF(String cpf){
        String regexCPF = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(regexCPF);
    }

    public abstract void mostraEstadoAtual();

}
