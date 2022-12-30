package adapter.classadapter;

/**
 * @author liaodezhi
 * @date 2022/12/29
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = output220V();
        return srcV / 44;
    }
}
