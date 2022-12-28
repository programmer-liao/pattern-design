package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * HighBuilding--高层建筑
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildFoundation() {
        System.out.println("高层建筑打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高层建筑砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("高层建筑盖屋顶");
    }
}
