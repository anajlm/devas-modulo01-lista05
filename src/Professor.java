import java.time.LocalDate;

public class Professor extends Funcionario {

    private String disciplina;
    private String departamento;
    private Double numAulasMinistradas = 0.0;
    private Double valorAulaMinistrada;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getNumAulasMinistradas() {
        return numAulasMinistradas;
    }

    public void setNumAulasMinistradas(Double numAulasMinistradas) {
        this.numAulasMinistradas = numAulasMinistradas;
    }

    public Double getValorAulaMinistrada() {
        return valorAulaMinistrada;
    }

    public void setValorAulaMinistrada(Double valorAulaMinistrada) {
        this.valorAulaMinistrada = valorAulaMinistrada;
    }

    public Professor(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, String ctps, Funcionario superiorImediato, String departamento, String disciplina, Double valorAulaMinistrada){
        super(nome, cpf, dataNascimento, endereco, telefone, ctps, superiorImediato);

        this.departamento = departamento;
        this.disciplina = disciplina;
        this.valorAulaMinistrada = valorAulaMinistrada;
    }

    @Override
    public Double calculaSalarioMensal() {
        Double salarioMensal = this.numAulasMinistradas * this.valorAulaMinistrada;
        return salarioMensal;
    }

    @Override
    public void mostraEstadoAtual() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Data admissão: " + this.getDataAdmissao());

        if (this.getSuperiorImediato() != null) {
            System.out.println("Superior imediato: " + this.getSuperiorImediato().getNome());
        } else {
            System.out.println("Superior imediato: esta pessoa é o chefe.");
        }

        System.out.printf("Salário: R$ %.2f %n", this.calculaSalarioMensal());
        System.out.println();
    }

    @Override
    public void batePonto(){
        this.numAulasMinistradas += 1;
    }

}
