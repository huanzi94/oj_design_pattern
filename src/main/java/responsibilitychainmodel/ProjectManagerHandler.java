package responsibilitychainmodel;

public class ProjectManagerHandler extends Handler{

    private Handler nextHandle;

    public void setNextHandle(Handler nextHandle) {
        this.nextHandle = nextHandle;
    }

    @Override
    public String process(int days) {
        if (days > 1) {
            System.out.println("请假时间为：" + days + "项目经理需要提交部门经理审核" );
            return nextHandle.process(days);
        } else {
            return "请假时间为：" + days + "项目经理审核通过！";
        }
    }

}
