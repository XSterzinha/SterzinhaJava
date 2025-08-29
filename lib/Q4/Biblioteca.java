public class Biblioteca {
    Livro[] livros;
    int contador = 0;

    public Biblioteca(int tamanho) {
        this.livros = new Livro[tamanho];
    }

    public void addLivro(Livro livro) {
        if (this.contador < livros.length) {
            livros[this.contador] = livro;
            this.contador++;
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < this.contador;i++) {
            Livro value = this.livros[i];
            if (value.getTitulo() == titulo) {
                value.emprestar();
            }
        }
    }
    
    public void devolverLivro(String titulo) {
        for (int i = 0; i < this.contador;i++) {
            Livro value = this.livros[i];
            if (value.getTitulo() == titulo) {
                value.devolver();
            }
        }
    }

    public void mostrar() {
        System.out.println("<Biblioteca contador=\"" + this.contador + "\">");
        for (int i = 0; i < this.contador ;i++) {
            Livro value = this.livros[i];
            System.out.println("\t" + value.mostrar());
        }
        System.out.println("</Biblioteca>");
    }
}
