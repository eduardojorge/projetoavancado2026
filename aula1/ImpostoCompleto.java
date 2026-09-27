public class ImpostoCompleto extends ImpostoRenda {

    private double gastoEducacao;
    private double gastoSaude;

    public ImpostoCompleto(
            double rendaBruta_,
            int ano_,
            double gastoEducacao_,
            double gastoSaude_) {

        super(rendaBruta_, ano_);
        this.gastoEducacao = gastoEducacao_;
        this.gastoSaude = gastoSaude_;
    }

    public ImpostoCompleto(double rendaBruta_, int ano_) {
        this(
            rendaBruta_,
            ano_,
            rendaBruta_ * 0.10,
            rendaBruta_ * 0.10
        );
    }

    public double getGastoEducacao() {
        return gastoEducacao;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    @Override
    public double calculo() {
        double impostoBruto;

        if (rendaBruta >= 100000) {
            impostoBruto = rendaBruta * 0.27;
        } else if (rendaBruta < 50000) {
            impostoBruto = rendaBruta * 0.12;
        } else {
            impostoBruto = rendaBruta * 0.23;
        }

        double impostoLiquido =
                impostoBruto - gastoEducacao - gastoSaude;

        // Impede que o imposto fique negativo.
        return Math.max(impostoLiquido, 0.0);
    }
}