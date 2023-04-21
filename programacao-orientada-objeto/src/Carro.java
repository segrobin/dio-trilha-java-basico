public class Carro {
    String cor;
    String modelo;
    int capacidadeTaque;
    public Carro() {

    }

    Carro(String cor,String modelo,int capacidadeTaque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTaque = capacidadeTaque;

    }



    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTaque(int capacidadeTaque){
        this.capacidadeTaque = capacidadeTaque;

    }

     int getCapacidadeTaque() {
        return capacidadeTaque;
    }
    double totalValorTanque(double valorCombustivel){
        return capacidadeTaque * valorCombustivel;

    }
}
