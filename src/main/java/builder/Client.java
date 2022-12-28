package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * 建造者模式演示
 */
public class Client {
    public static void main(String[] args) {
        // 建造普通房屋
        OrdinaryHouse ordinaryHouse = new OrdinaryHouse();
        HouseDirector houseDirector1 = new HouseDirector(ordinaryHouse);
        House house1 = houseDirector1.buildHouse();
        System.out.println(house1);
        // 建造高层建筑
        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector2 = new HouseDirector(highBuilding);
        House house2 = houseDirector2.buildHouse();
        System.out.println(house2);
    }
}
