package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 代理工厂类
 */
public class ProxyFactory {
    /**
     * 被代理对象target
     */
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 通过JDK代理生成代理对象
        return Proxy.newProxyInstance (
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理：可在此处添加增强代码块");
                    Object returnVal = method.invoke(target, args);
                    System.out.println("JDK代理：可在此处添加增强代码块");
                    return returnVal;
                });
    }
}
