package br.com.testepratico;

public class FaturamentoMensal {
    public static void main(String[] args) {

        double[] faturamentoDiario = {
                22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0,
                0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,
                18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;


        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                somaFaturamento += valor;
                diasComFaturamento++;
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
            }
        }

        // Calcula a média de faturamento, ignorando dias sem faturamento
        double mediaFaturamento = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;

        // Conta os dias com faturamento acima da média
        int diasAcimaDaMedia = 0;
        for (double valor : faturamentoDiario) {
            if (valor > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.printf("Média do faturamento: %.2f\n", mediaFaturamento);
        System.out.printf("Menor valor de faturamento: %.2f\n", menorFaturamento);
        System.out.printf("Maior valor de faturamento: %.2f\n", maiorFaturamento);
        System.out.printf("Número de dias com faturamento acima da média: %d\n", diasAcimaDaMedia);
    }
}
