package proxy.dynamicproxy;

/**
 * @author liaodezhi
 * @date 2022/12/26
 * 被代理类
 */
public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("老师正在教书");
    }
}
