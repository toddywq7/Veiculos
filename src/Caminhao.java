public class Caminhao {

    public String marca;
    public String tipo;
    public String potencia;
    public String ano_veiculo;


    public Caminhao(String marca, String tipo, String potencia, String ano_veiculo) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.ano_veiculo = ano_veiculo;
    }

    public Caminhao(String marca) {
        this.marca = marca;
    }
}
