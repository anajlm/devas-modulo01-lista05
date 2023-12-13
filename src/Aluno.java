import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String curso;
    private String matricula;
    private static int sequencialMatricula = 1000;
    private LocalDate dataIngresso;
    private LocalDate dataPrevisaoFormatura;

    public Aluno(){}

    public Aluno(String nome, String cpf, LocalDate dataNascimento, String endereco, String telefone, String curso){
        super(nome, cpf, dataNascimento, endereco, telefone);

        this.curso = curso;
        this.dataIngresso = currentDate();
        this.matricula = geraNovaMatricula(curso);
        this.dataPrevisaoFormatura = geraDataPrevisaoFormatura();
    }

    // Getters
    public String getCurso() {
        return curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public static int getSequencialMatricula() {
        return sequencialMatricula;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public LocalDate getDataPrevisaoFormatura() {
        return dataPrevisaoFormatura;
    }


    // Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void setSequencialMatricula(int sequencialMatricula) {
        Aluno.sequencialMatricula = sequencialMatricula;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public void setDataPrevisaoFormatura(LocalDate dataPrevisaoFormatura) {
        this.dataPrevisaoFormatura = dataPrevisaoFormatura;
    }


    private String geraNovaMatricula(String curso){
        String novaMatricula = getAnoIngressoFromDataIngresso();
        if(curso.equals("Medicina")){
            novaMatricula += "001";
        } else if(curso.equals("Direito")){
            novaMatricula += "002";
        } else if (curso.equals("Engenharia")) {
            novaMatricula += "003";
        } else if (curso.equals("Ciências da Computação")) {
            novaMatricula += "004";
        } else if (curso.equals("Jornalismo")){
            novaMatricula += "005";
        }
        novaMatricula += this.sequencialMatricula;
        this.sequencialMatricula += 1;

        return novaMatricula;
    }

    public LocalDate currentDate(){
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }

    private String getAnoIngressoFromDataIngresso(){
        int anoIngresso = (this.dataIngresso).getYear();
        return String.valueOf(anoIngresso);
    }

    public LocalDate geraDataPrevisaoFormatura(){
        LocalDate dataPrevisaoFormatura;

        if(curso.equals("Medicina")){
            dataPrevisaoFormatura = this.dataIngresso.plusYears(6);
        } else if(curso.equals("Jornalismo")){
            dataPrevisaoFormatura = this.dataIngresso.plusYears(4);
        } else {
            dataPrevisaoFormatura = this.dataIngresso.plusYears(5);
        }

        return dataPrevisaoFormatura;
    }

    @Override
    public void mostraEstadoAtual() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Previsão de formatura: " + this.getDataPrevisaoFormatura());
    }

}
