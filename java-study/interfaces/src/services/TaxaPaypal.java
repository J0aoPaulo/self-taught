package services;

import services.OnlinePaymentService;

public class TaxaPaypal implements OnlinePaymentService {

    @Override
    public double paymentFee(double amount) {
        return amount + (amount * 0.02);
    }

    @Override
    public double interest(double amount, Integer months) {
        double restAmount = paymentFee(amount);

        return restAmount + ((restAmount / 100 ) * months);
    }
}