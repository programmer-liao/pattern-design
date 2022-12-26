package flyweight;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 外部状态--用户
 */
public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

}
