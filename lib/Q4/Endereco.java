public class Endereco {
    private int numero;
    private String rua;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    } 

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String mostrar() {
        return "<Endereco numero=\"" + this.numero + "\" rua=\"" + this.rua + "\"/>";
    }
}
