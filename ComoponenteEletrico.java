public class ComponenteEletrico extends Componente {
    private int quantidadeDeFios;
    private double custo;

    public ComponenteEletrico(String nome, int quantidade, double potencia, int quantidadeDeFios, double custo) {
        super(nome, quantidade, potencia);
        this.quantidadeDeFios = quantidadeDeFios;
        this.custo = custo;
    }

    @Override
    public int getQuantidadeDeFiosNecessarios() {
        return quantidadeDeFios;
    }

    @Override
    public double getCusto() {
        return custo;
    }
}
