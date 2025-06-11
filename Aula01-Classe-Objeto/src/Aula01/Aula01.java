package Aula01;

import javax.swing.plaf.basic.BasicArrowButton;

public class Aula01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.marca = "Toyota";
        car1.modelo = "Corolla";
        car1.cor = "Preto fosco";
        car1.ano = 2019;
        car1.potencia= 120;

        System.out.println("Marca:" + car1.marca);
        car1.ligar();
        car1.desligar();
    }
}
