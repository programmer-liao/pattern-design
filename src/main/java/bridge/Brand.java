package bridge;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * Brand手机品牌接口
 */
public interface Brand {
    /**
     * 开机
     */
    void open();

    /**
     * 关机
     */
    void close();

    /**
     * 打电话
     */
    void call();
}
