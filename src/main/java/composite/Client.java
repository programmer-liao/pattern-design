package composite;

/**
 * @author liaodezhi
 * @date 2022/12/30
 * 演示组合模式
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("湖南科技大学", "一所综合性大学");
        College college1 = new College("计算机学院", "");
        College college2 = new College("信息学院", "");
        university.add(college1);
        university.add(college2);
        college1.add(new Department("计算机科学与技术", ""));
        college1.add(new Department("软件工程", ""));
        college1.add(new Department("网络工程", ""));
        college2.add(new Department("机器人工程", ""));
        college2.add(new Department("电子信息工程", ""));
        college2.add(new Department("通信工程", ""));
        university.print();
    }
}
