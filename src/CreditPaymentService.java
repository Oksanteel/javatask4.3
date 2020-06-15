public class CreditPaymentService {
    public double calculate(int total, double percent, int month){
        double monthpercent = percent/100/12;
        double amount = total * (monthpercent/(1-Math.pow(1+monthpercent,-month)));
        return amount;
    }
}
