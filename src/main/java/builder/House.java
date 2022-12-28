package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * House房子实体类
 */
public class House {
    /**
     * 地基
     */
    private String foundation;

    /**
     * 墙体
     */
    private String wall;

    /**
     * 房顶
     */
    private String roof;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

}
