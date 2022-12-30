package composite;

/**
 * @author liaodezhi
 * @date 2022/12/30
 */
public abstract class OrganizationComponent {
    /**
     * 名称
     */
    private String name;

    /**
     * 说明
     */
    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }
    protected abstract void print();
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
