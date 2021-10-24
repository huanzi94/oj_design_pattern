package compositemode;

import java.util.ArrayList;
import java.util.List;

public class College extends Organization{

    List<Organization> organizations = new ArrayList<>();

    public College(String name, String desc) {
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
        System.out.println("====" + getName());
        organizations.forEach(Organization::printDesc);
    }
}
