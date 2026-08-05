public class Carros {

    // atributos

    public String marca;
    public String modelo;
    public String numportas;
    public String ano_veiculo;
    public String potencia;


    // construtor

    public Carros(String marca, String modelo, String numportas, String ano_veiculo, String potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.numportas = numportas;
        this.ano_veiculo = ano_veiculo;
        this.potencia= potencia;
  }

  public Carros(String marca, String modelo, String numportas){
        this.marca = marca;
        this.modelo= modelo;
        this.numportas= numportas;
  }


    //metodos

    public String acelerar(){
        return "Acelerando o carro";
    }

    public String freiar(){
        return "freiando o carro";
    }

}
