import java.time.LocalDate;

public final class Atendente extends Funcionario {

    private Double cargaHorariaDiaria;
    private String setor;
    private Double numHorasTrabalhadas = 0.0;
    private Double valorHoraTrabalhada;

    public Atendente(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, String ctps, Funcionario superiorImediato, String setor, Double valorHoraTrabalhada){
        super(nome, cpf, dataNascimento, endereco, telefone, ctps, superiorImediato);

        this.cargaHorariaDiaria = 8.0;
        this.setor = setor;
        this.valorHoraTrabalhada = valorHoraTrabalhada;

    }

    // Getters
    public Double getCargaHorariaDiaria() {
        return cargaHorariaDiaria;
    }

    public String getSetor() {
        return setor;
    }

    public Double getNumHorasTrabalhadas() {
        return numHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }


    // Setters
    public void setCargaHorariaDiaria(Double cargaHorariaDiaria) {
        this.cargaHorariaDiaria = cargaHorariaDiaria;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setNumHorasTrabalhadas(Double numHorasTrabalhadas) {
        this.numHorasTrabalhadas = numHorasTrabalhadas;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }


    @Override
    public Double calculaSalarioMensal() {
        Double salarioMensal = this.valorHoraTrabalhada * this.numHorasTrabalhadas;
        return salarioMensal;
    }

    @Override
    public void batePonto() {
        this.numHorasTrabalhadas += cargaHorariaDiaria;
    }

    @Override
    public void mostraEstadoAtual() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Data admissão: " + this.getDataAdmissao());

        if(this.getSuperiorImediato() != null) {
            System.out.println("Superior imediato: " + this.getSuperiorImediato().getNome());
        } else {
            System.out.println("Superior imediato: ");
        }

        System.out.printf("Salário: R$ %.2f %n", this.calculaSalarioMensal());
        System.out.println();
    }
}
