public class Moto {

    // atributos

    public String marca;
    public String modelo;
    public String potencia;
    public String ano_veiculo;


    // construtor

    public Moto(String marca, String modelo, String potencia, String ano_veiculo){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.ano_veiculo = ano_veiculo;
    }

    public Moto(String marca, String modelo, String potencia){
        this.marca = marca;
        this.modelo= modelo;
        this.potencia= potencia;
    }

}
