package Conta;

public class Conta {
    String titular;
    Integer numero_conta;
    Double saldo;

    void sacar(){
       this.saldo = this.saldo - 25.00;
    }

    void depositar(){
        this.saldo = this.saldo + 50;
    }

    void consultar(){
        System.out.println("Saldo R$:" + this.saldo);
    }
}
