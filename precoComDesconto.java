public class precoComDesconto {
    public static void main(String[] args) {
        double precoOriginal = 340.00;
        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto de %.0f%%: R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);
    }
}
