public class Livro {
    private String autor;
    private String titulo;
    private boolean disponivel = true;

    public Livro(String nTitulo, String nAutor) {
        this.autor = nAutor;
        this.titulo = nTitulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        if (disponivel == true) {
            System.out.println("Livro emprestado: " + titulo);
            this.disponivel = false;
        }
    }

    public void devolver() {
        if (disponivel == false) {
            System.out.println("Livro devolvido: " + titulo);
            this.disponivel = true;
        }
    }

    public String mostrar() {
        return (
            "<Livro " + 
                "titulo=\"" + this.titulo + "\" " +
                "autor=\"" + this.autor + "\" " +
                "disponivel=\""+ this.disponivel + "\"/>" 
        );
    }
}
