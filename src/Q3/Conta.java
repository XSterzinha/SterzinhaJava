public class Conta {
    private double saldo;
    private int numero;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double quantidade) {
        System.out.println("Depositou: " + quantidade);
        this.saldo += quantidade;
    }

    public void sacar(double quantidade) {
        System.out.println("Sacou: " + quantidade);
        this.saldo -= quantidade;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void mostrar() {
        System.out.println("<Conta numero=\"" + this.numero + "\" saldo=\"" + this.saldo  + "\"/>");
    }
}
