import java.time.LocalDate;

public final class Bolsista extends Aluno {

    private Double bolsa;

    public Bolsista(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, String curso, Double bolsa){
        super(nome, cpf, dataNascimento, endereco, telefone, curso);

        this.bolsa = bolsa;
    }

    // Getters
    public Double getBolsa() {
        return bolsa;
    }

    // Setters
    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    public void mostraEstadoAtual(){
        super.mostraEstadoAtual();
        System.out.printf("Bolsa: R$ %.2f %n", this.bolsa);
    }
}
