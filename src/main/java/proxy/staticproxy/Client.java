package proxy.staticproxy;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 演示静态代理
 */
public class Client {
    public static void main(String[] args) {
        // 被代理对象
        TeacherDAO teacherDAO = new TeacherDAO();
        // 代理对象
        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);
        // 通过代理对象调用teach方法
        teacherDAOProxy.teach();
    }
}
