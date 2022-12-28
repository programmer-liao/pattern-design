package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * HouseBuilder抽象建造者类
 */
public abstract class HouseBuilder {

    /**
     * 房屋建造对象
     */
    protected House house = new House();

    /**
     * 建造地基
     */
    public abstract void buildFoundation();

    /**
     * 建造墙体
     */
    public abstract void buildWall();

    /**
     * 建造屋顶
     */
    public abstract void buildRoof();

    /**
     * 建造房屋
     */
    public House buildHouse() {
        // 将建好后的房子返回
        return house;
    }
}
