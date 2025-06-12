package Conta;

public class Conta1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.titular = "Pedro";
        conta1.numero_conta = 12345;
        conta1.saldo = 0.00;

        System.out.println("Cliente: " + conta1.titular);
        System.out.println("Número da conta:" + conta1.numero_conta);
        System.out.println("Saldo da conta R$: " + conta1.saldo);

        conta1.depositar();
        conta1.consultar();
        conta1.sacar();
        conta1.consultar();
        conta1.sacar();
        conta1.consultar();

    }
}
