public class Pessoa {
    int idade;
    String nome;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostra() {
        System.out.println("<Pessoa nome=\"" + this.nome + "\" idade=\"" + this.idade + "\"/>");
    } 
}
