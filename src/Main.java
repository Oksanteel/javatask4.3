public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double amount1 = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Сумма ежемесячного платежа равна " + String.format("%.0f", amount1));

        double amount2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Сумма ежемесячного платежа равна " + String.format("%.0f", amount2));

        double amount3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Сумма ежемесячного платежа равна " + String.format("%.0f", amount3));
    }
}
