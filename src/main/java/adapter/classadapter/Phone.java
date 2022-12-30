package adapter.classadapter;

/**
 * @author liaodezhi
 * @date 2022/12/29
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.println("电压不是5V，不能充电");
        }
    }
}
