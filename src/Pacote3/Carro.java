package Pacote3;
 public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    private int NumChassi;
    private int velocidadeatual;

    public int getVelocidadeatual() {
        return velocidadeatual;
    }

    public Carro() {}

    public Carro(String placa, int numChassi){
        setPlaca(placa);
        this.NumChassi = numChassi;
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa != null && placa.length() == 7 &&
            placa.matches("[A-Z]{3}\\d{4}")) {
            this.letrasPlaca = placa.substring(0, 3);
            this.numerosPlaca = Integer.parseInt(placa.substring(3));
        } else {
            this.letrasPlaca = "ERRO!!!";
        }
    }

    public int getNumChassi() {
        return NumChassi;
    }

    public void setNumChassi(int numChassi) {
        NumChassi = numChassi;
    }

    public void acelerar() {
        this.velocidadeatual++;
    }

    public void acelerar(int limite){
        for(int i = velocidadeatual; i < limite; i++) {
            acelerar();
        }
    }

    public boolean frear() {
        return false;
    }
    
}
