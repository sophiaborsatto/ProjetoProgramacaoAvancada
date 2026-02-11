//final -> imutavel | Aula Java
public abstract class Veiculo {

    private final String placa;
    private String modelo;
    private final int anoFabricacao;
    private double quilometragemAtual;
    private double valor;
    private SituacaoVeiculo situacao = SituacaoVeiculo.DISPONIVEL;

    public Veiculo(String placa, int anoFabricacao, String modelo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.quilometragemAtual = 0;
    }

    public Veiculo(double valor, int anoFabricacao, String modelo, String placa) {
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.placa = placa;
        this.quilometragemAtual = 0;
    }

    private void registarRota(double quilometragem){
        this.situacao = SituacaoVeiculo.EM_ROTA;

        if (quilometragem > 0){
            throw new QuilometragemNegativaException();
        }
        this.quilometragemAtual+=quilometragem;

        if (precisaManutencao()){
            this.situacao=SituacaoVeiculo.MANUTENCAO;
        }else {
            this.situacao=SituacaoVeiculo.DISPONIVEL;
        }
    }

    public  abstract boolean precisaManutencao();

    public double getQuilometragemAtual() {
        return quilometragemAtual;
    }


    public double getValor() {
        return valor;
    }
}
