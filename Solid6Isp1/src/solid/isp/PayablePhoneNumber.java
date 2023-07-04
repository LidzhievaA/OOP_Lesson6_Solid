package solid.isp;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public interface PayablePhoneNumber {

    void payPhoneNumber(int amount) throws NotImplementedException;

}