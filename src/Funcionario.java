import java.nio.file.ClosedFileSystemException;
import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    private String ctps;
    private LocalDate dataAdmissao;
    private Funcionario superiorImediato;

    public Funcionario(){}

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, String ctps, Funcionario superiorImediato){
        super(nome, cpf, dataNascimento, endereco, telefone);

        if(validaCTPS(ctps)){
            this.ctps = ctps;
        } else {
            throw new RuntimeException("CTPS inválido");
        }
        this.dataAdmissao = LocalDate.now();
        this.superiorImediato = superiorImediato;

    }

    // Getters
    public String getCtps() {
        return this.ctps;
    }

    public LocalDate getDataAdmissao() {
        return this.dataAdmissao;
    }

    public Funcionario getSuperiorImediato() {
        return this.superiorImediato;

    }

    // Setters
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setSuperiorImediato(Funcionario superiorImediato) {
        this.superiorImediato = superiorImediato;
    }


    public Boolean validaCTPS(String ctps){
        String regexCTPS = "\\d{7}/\\d{4}";
        return ctps.matches(regexCTPS);
    }

    public abstract Double calculaSalarioMensal();

    public abstract void batePonto();

}
