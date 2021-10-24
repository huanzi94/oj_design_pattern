package compositemode;

/**
 * 组织
 */
public abstract class Organization {

    private String name;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 添加组织
     */
    protected void addOrganization(Organization organization) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除组织
     */
    protected void removeOrganization(Organization organization) {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印组织信息
     * @return 组织信息
     */
    protected abstract void printDesc();
}
