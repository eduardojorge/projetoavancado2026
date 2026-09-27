public abstract class ImpostoRenda {

    protected double valorPagar;
    protected double rendaBruta;
    protected int ano;

    public ImpostoRenda(double rendaBruta_, int ano_) {
        this.rendaBruta = rendaBruta_;
        this.ano = ano_;
        this.valorPagar = 0.0;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public int getAno() {
        return ano;
    }

    public abstract double calculo();

    public boolean processamento(int anoBase) {
        if (anoBase == ano && rendaBruta > 12000) {
            valorPagar = calculo();
            return true;
        }

        valorPagar = 0.0;
        return false;
    }
}