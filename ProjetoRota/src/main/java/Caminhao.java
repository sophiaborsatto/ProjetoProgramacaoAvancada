public class Caminhao extends Veiculo implements CalculoSeguro{
    private double capacidadeCarga = 0;
    private int eixo;

    public Caminhao(double valor, int anoFabricacao, String modelo, String placa, int eixo, double capacidadeCarga) {
        super(valor, anoFabricacao, modelo, placa);
        this.eixo = eixo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void registrarRota(double quilometragem){
        this.capacidadeCarga = capacidadeCarga;
        registrarRota(quilometragem);
    }

    @Override
    public boolean preisaManutencao(){
        if(getQuilometragemAtual() >= 10000){
            return true;
        }

        if (capacidadeCarga > 500){
            return true;
        }

        return false;
    }

    @Override
    public double calcularSeguro(){
        return (getValor()*0.02) + (capacidadeCarga*50);
    }

    @Override
    public boolean precisaManutencao() {
        return false;
    }
}
