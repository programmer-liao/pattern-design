package bridge;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * FoldedPhone--折叠样式手机
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
