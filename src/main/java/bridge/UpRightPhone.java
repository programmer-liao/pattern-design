package bridge;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * FoldedPhone--直立样式手机
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
