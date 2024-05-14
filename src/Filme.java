public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    int totalAvaliacaoes;
    double nota;
    double somaDasAvaliacoes;
    boolean incluidoNoPlano;


    // como retorna nada, usamos void
    void exibiFilme() {
        System.out.println("Nome do file: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido do Plano: " + incluidoNoPlano);

    }

    // avaliar o filme
    void avaliaFilme (double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacaoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes/totalAvaliacaoes;
    }
}