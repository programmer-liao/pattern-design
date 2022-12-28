package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * HouseDirector--房屋建造指挥者
 */
public class HouseDirector {

    /**
     * HouseBuilder对象
     */
    private HouseBuilder houseBuilder = null;

    /**
     * 通过构造器传入HouseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过Setter传入HouseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
