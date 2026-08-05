public class Bicicleta {

    // atributos

    public String modelo;
    public String marca;
    public String cor;


    // construtor

    public Bicicleta(String modelo, String marca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    public Bicicleta(String marca, String modelo){
        this.marca = marca;
        this.modelo= modelo;

    }

}
