package prototype;

/**
 * @author liaodezhi
 * @date 2022/12/27
 * 原型模式演示
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("小花", 10, "白色");
        Sheep clonedSheep = sheep.clone();
        System.out.println(sheep);
        System.out.println(clonedSheep);
    }
}
