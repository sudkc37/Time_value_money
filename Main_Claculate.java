package TimeValueOfMoney;

public class Claculate {
    public static void main(String[] args) {
        System.out.println(TVM.PresentValue(1000, 7.0, 15.0));
        System.out.println(TVM.futureValue(1000,7.0,15.0));

        System.out.println(TVM.PresentValueOfCashFlow(new int[]{100, 150, 180},11.0));
    }

}
