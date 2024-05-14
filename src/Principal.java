public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        // Adicionando o filme
        favorito.nome = "O Auto da Compadecida";
        favorito.anoDeLancamento = 2000;
        favorito.duracaoEmMinutos = 164;
        favorito.incluidoNoPlano = true;

        favorito.exibiFilme();

        favorito.avaliaFilme(8.8);
        favorito.avaliaFilme(9.8);
        favorito.avaliaFilme(10);
        favorito.avaliaFilme(9.7);

        System.out.printf("O filme tem uma média de avaliação de: %.2f", favorito.pegaMedia());

    }
}
