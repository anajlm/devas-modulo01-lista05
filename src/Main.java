import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Aluno
        Aluno aluno1 = new Aluno("Ana", "999.999.999-99", LocalDate.of(2000, 3, 14), "Belo Horizonte", "12345678", "Engenharia");
        System.out.println("Aluno 1");
        aluno1.mostraEstadoAtual();
        System.out.println();

        Aluno aluno2 = new Aluno("João", "999.999.999-99", LocalDate.of(2000, 3, 14), "Belo Horizonte", "12345678", "Medicina");
        System.out.println("Aluno 2");
        aluno2.mostraEstadoAtual();
        System.out.println();

        // Bolsista
        Bolsista bolsista1 = new Bolsista("Fernando", "999.999.999-99", LocalDate.of(1998, 2, 1), "Belo Horizonte", "12345678", "Jornalismo", 1000.0);
        System.out.println("Bolsista 1");
        bolsista1.mostraEstadoAtual();
        System.out.println();


        // Atendente
        Atendente atendente1 = new Atendente("Maria", "999.999.999-99", LocalDate.of(1980, 10,12), "Belo Horizonte", "12345678", "1234567/1234", null, "ADM", 50.0);
        System.out.println("Atendente 1");
        atendente1.mostraEstadoAtual();
        atendente1.batePonto();
        atendente1.mostraEstadoAtual();
        atendente1.batePonto();
        atendente1.mostraEstadoAtual();

        Atendente atendente2 = new Atendente("Paulo", "999.999.999-99", LocalDate.of(1990, 6,5), "Belo Horizonte", "12345678", "1234567/1234", atendente1, "ADM", 40.0);
        System.out.println("Atendente 2");
        atendente2.mostraEstadoAtual();
        atendente2.batePonto();
        atendente2.mostraEstadoAtual();
        atendente2.batePonto();
        atendente2.mostraEstadoAtual();


        // Professor
        Professor professor1 = new Professor("Ricardo", "999.999.999-99", LocalDate.of(1970, 12,1), "Belo Horizonte", "12345678", "1234567/1234", null, "Matemática", "Cálculo", 200.0);
        System.out.println("Professor 1");
        professor1.mostraEstadoAtual();
        professor1.batePonto();
        professor1.mostraEstadoAtual();

    }
}