package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liaodezhi
 * @date 2022/12/30
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

}
