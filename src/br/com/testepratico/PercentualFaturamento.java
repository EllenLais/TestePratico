package br.com.testepratico;

public class PercentualFaturamento {
    public static void main(String[] args) {

        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double fatTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        double percentSP = (faturamentoSP/fatTotal) * 100;
        double percentRJ = (faturamentoRJ/fatTotal) * 100;
        double percentMG = (faturamentoMG/fatTotal) * 100;
        double percentES = (faturamentoES/fatTotal) * 100;
        double percentOutros = (faturamentoOutros/fatTotal) * 100;

        System.out.printf("O percentual de faturamento em SP é de: %.2f%%\n", percentSP);
        System.out.printf("O percentual de faturamento no RJ é de: %.2f%%\n", percentRJ);
        System.out.printf("O percentual de faturamento em MG é de: %.2f%%\n", percentMG);
        System.out.printf("O percentual de faturamento no ES é de: %.2f%%\n", percentES);
        System.out.printf("O percentual de faturamento em outros estados é de: %.2f%%\n", percentOutros);

    }
}
