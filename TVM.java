package TimeValueOfMoney;

import static java.lang.Math.pow;

public final class TVM {
    protected long futureValue;
    protected double rate;
    protected int noOfYear;
    protected double presentValue;
    protected int [] payment;

    public TVM() {
        this.futureValue = futureValue;
        this.rate = rate;
        this.noOfYear = noOfYear;
        this.presentValue = presentValue;
        this.payment= payment;

    }

    public static double PresentValue(long futureValue, double rate, double noOfYear) {
        return (futureValue / (pow((1 + rate/100), noOfYear)));

    }

    public static double futureValue(long presentValue, double rate, double noOfYear) {
        return (presentValue * (pow((1 + rate/100), noOfYear)));
    }



    public static double PresentValueOfCashFlow(int[] payment, double rate) {
        double total = 0.0;
        int index=0;
        for (int i = 0; i < payment.length; i++) {
            total += (payment[i] / (pow((1 + rate), (index))));
            index++;
        }
        return total;

    }


}
