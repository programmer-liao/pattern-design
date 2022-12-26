package flyweight;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 演示享元模式
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite1 = webSiteFactory.getWebSiteType("新闻");
        webSite1.use(new User("Tom"));
        WebSite webSite2 = webSiteFactory.getWebSiteType("博客");
        webSite2.use(new User("Jerry"));
        WebSite webSite3 = webSiteFactory.getWebSiteType("博客");
        webSite3.use(new User("Mic"));
        WebSite webSite4 = webSiteFactory.getWebSiteType("博客");
        webSite4.use(new User("Petty"));
        System.out.println("共" + webSiteFactory.getWebSiteCount() + "种网站类型");
    }
}
