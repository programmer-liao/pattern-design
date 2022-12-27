package bridge;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * 桥接模式演示
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new Vivo());
        phone1.open();
        phone1.close();
        phone1.call();
        System.out.println("----------------------");
        Phone phone2 = new FoldedPhone(new XiaoMi());
        phone2.open();
        phone2.close();
        phone2.call();
        System.out.println("----------------------");
        Phone phone3 = new UpRightPhone(new Vivo());
        phone3.open();
        phone3.close();
        phone3.call();
        System.out.println("----------------------");
        Phone phone4 = new UpRightPhone(new XiaoMi());
        phone4.open();
        phone4.close();
        phone4.call();
        System.out.println("----------------------");
    }
}
