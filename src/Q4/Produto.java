public class Produto {
    private String nome;
    private double preco;
    
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    } 

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrar() {
        System.out.println("<Produto nome=\"" + this.nome  + "\" preco=\"" + this.preco + "\"/>");
    }
}
