package seminars.seminar6.Solid6Isp1.src.solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements Payable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        throw new NotImplementedException();
    }
}
