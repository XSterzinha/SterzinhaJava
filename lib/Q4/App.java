public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Lapis");

        produto.setPreco(6.5);

        produto.mostrar();

        produto.setNome("Borracha");

        produto.setPreco(2.5);

        produto.mostrar();

        System.out.println();

        Pessoa luana = new Pessoa("Luana", 22, new Endereco("SP", 26));

        Pessoa pedro = new Pessoa("Pedro", 22, new Endereco("PA", 78));

        luana.mostrar();

        pedro.mostrar();

        produto.mostrar();

        System.out.println();

        Biblioteca biblioteca = new Biblioteca(5);
        
        biblioteca.addLivro(new Livro("Cycles", "Tenno"));

        biblioteca.addLivro(new Livro("Life Paths", "Tenno"));

        biblioteca.addLivro(new Livro("Dragonfly", "Tenno"));
        
        biblioteca.mostrar();

        biblioteca.emprestarLivro("Dragonfly");

        biblioteca.devolverLivro("Dragonfly");

        biblioteca.mostrar();
    }
}
