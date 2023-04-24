package Pacote2;

import Pacote3.Carro;

public class App {
    
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("ABC1234",123456789);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeatual());
        System.out.println("ACELERANDO O CARRO...");
        for (int i = 0; i < 10; i++) {
            carro.acelerar();
        }
        System.out.println("Velocidade do carro: " + carro.getVelocidadeatual());

        System.out.println("Acelerando até 50KM/H");
        carro.acelerar(50);
        System.out.println("Velocidade do carro: " + carro.getVelocidadeatual());
    }
}
