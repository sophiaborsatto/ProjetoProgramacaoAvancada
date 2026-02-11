public class Moto  extends Veiculo implements CalculoSeguro {

    private int cilindrada;

    public Moto(String placa, int anoFabricacao, String modelo, double valor, int cilindrada) {
        super(placa, anoFabricacao, modelo);
        this.cilindrada = cilindrada;
    }
    @Override
    public boolean precisaManutencao(){
        if (getQuilometragemAtual()>= 3000){
            return true;
        }
        return false;
    }

    @Override
    public boolean preisaManutencao() {
        return false;
    }

    @Override
    public double calcularSeguro() {
        return getValor() * 0.05;
    }
}
