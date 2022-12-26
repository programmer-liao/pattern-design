package proxy.dynamicproxy;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 演示Jdk动态代理
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDAO);
        // 获取代理对象，并强转为ITeacherDAO
        ITeacherDAO proxyInstance = (ITeacherDAO)proxyFactory.getProxyInstance();
        // 通过代理对象调用方法
        proxyInstance.teach();
    }
}
