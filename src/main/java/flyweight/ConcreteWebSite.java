package flyweight;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 抽象类WebSite实现子类ConcreteWebSite
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 网站发布的类型--内部状态
     */
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + "  当前使用用户：" + user.getName());
    }
}
