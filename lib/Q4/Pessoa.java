public class Pessoa {
    private int idade;
    private String nome;
    private Endereco endereco;


    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void mostrar() {
        System.out.println("<Pessoa nome=\""+ this.nome +"\" idade=\"" + this.idade + "\">\n\t" + endereco.mostrar() + "\n</Endereco>");
    }
}
