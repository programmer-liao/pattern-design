package builder;

/**
 * @author liaodezhi
 * @date 2022/12/28
 * OrdinaryHouse--普通住宅
 */
public class OrdinaryHouse extends HouseBuilder {

    @Override
    public void buildFoundation() {
        System.out.println("普通住宅打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通住宅砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通住宅盖屋顶");
    }
}
