package compositemode;

public class Department extends Organization{

    public Department(String name, String desc) {
        super(name, desc);
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
        System.out.println("=======" + getName());
    }
}
