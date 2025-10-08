public class valorEmDolares {
    public static void main(String[] args) {
        double valorEmDolares = 1.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.printf("US$ %.2f equivalem a R$ %.2f%n", valorEmDolares, valorEmReais);
    }
}