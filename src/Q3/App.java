public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 0.0);
        

        conta.depositar( 32.0);
        conta.depositar(65);
        conta.depositar(20);
        conta.mostrar();
        
        conta.sacar(69);
        conta.mostrar();

        conta.depositar(38);
        conta.mostrar();
    }   
}
