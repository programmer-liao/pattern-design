package bridge;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * 手机抽象类--Phone
 */
public abstract class Phone {

    private final Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
