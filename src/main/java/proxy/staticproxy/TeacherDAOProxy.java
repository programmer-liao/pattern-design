package proxy.staticproxy;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 代理类，需实现ITeacher接口
 */
public class TeacherDAOProxy implements ITeacherDAO {

    /**
     * 用于接收被代理对象
     */
    private final ITeacherDAO target;

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("被代理方法执行前：此处可以添加增强代码逻辑");
        target.teach();
        System.out.println("被代理方法执行前：此处可以添加增强代码逻辑");
    }
}
