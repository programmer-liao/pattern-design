package flyweight;

import java.util.HashMap;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 网站工厂类WebSiteFactory
 */
public class WebSiteFactory {
    /**
     * 池
     */
    private final HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * 根据网站的类型返回一个网站，如果没有就创建一个，并放入到池中
     */
    public WebSite getWebSiteType(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取pool中网站的个数
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
