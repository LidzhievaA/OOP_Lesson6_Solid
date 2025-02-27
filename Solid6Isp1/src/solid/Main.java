package solid;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import solid.isp.InternetPaymentService;
import solid.isp.TerminalPaymentService;

public class Main {
    public static void main(String[] args) throws NotImplementedException {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
        // terminalService.payPhoneNumber(10);
    }
}
