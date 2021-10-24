package compositemode;

public class Client {

    public static void main(String[] args) {
        Organization university = new University("北京大学", "北京大学");

        Organization college = new College("计算机学院", "计算机学院");
        Organization college1 = new College("信工学院", "信工学院");

        Department department = new Department("信息安全系", "信息安全系");
        Department department1 = new Department("网络安全系", "网络安全系");
        college.addOrganization(department);
        college.addOrganization(department1);

        Department department2 = new Department("计算机编程系", "计算机编程系");
        Department department3 = new Department("测试系", "测试系");
        college1.addOrganization(department2);
        college1.addOrganization(department3);

        university.addOrganization(college);
        university.addOrganization(college1);
        university.printDesc();
    }
}
