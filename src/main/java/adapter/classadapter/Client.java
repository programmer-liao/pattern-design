package adapter.classadapter;

/**
 * @author liaodezhi
 * @date 2022/12/30
 * 演示适配器模式--类适配器
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
