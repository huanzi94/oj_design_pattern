package compositemode;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends Organization {

    /**
     * 实际上组合的是学院
     */
    List<Organization> organizations = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void addOrganization(Organization organization) {
        organizations.add(organization);
    }

    @Override
    protected void removeOrganization(Organization organization) {
        organizations.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void printDesc() {
        System.out.println("==" + getName());
        organizations.forEach(Organization::printDesc);
    }
}
