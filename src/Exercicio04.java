interface tributavel {
    double calcularTributos();
}

class contaPoupanca implements tributavel {
    @Override
    public double calculartributos() {
        return 0.0; //

        class contacorrente implements tributavel {
            private double saldo;

            public contacorrente(double saldo) {
                this.saldo = saldo;}

            @Override
            public double calculartributos() {
                return saldo * 0.01;}}

        class segurovida implements tributavel {
            private double valorseguro = 42.0;

            @Override
            public double calculartributos() {
                return valorSeguro;}}

        public class testetributos {
            public static void main(String[] args) {
                Contapoupanca contaPoupanca = new Contapoupanca();
                Contacorrente contaCorrente = new Contacorrente(1000.0);
                Segurovida seguroDeVida = new Segurovida();

                double tributoscontapoupanca = contaPoupanca.calcularTributos();
                double tributoscontacorrente = contaCorrente.calcularTributos();
                double tributossegurovida = seguroDeVida.calcularTributos();

                System.out.println("Tributos da Poupança: " + tributosContaPoupanca);
                System.out.println("Tributos da Conta Corrente: " + tributosContaCorrente);
                System.out.println("Tributos do Seguro de vida: " + tributosSeguroDeVida);}}