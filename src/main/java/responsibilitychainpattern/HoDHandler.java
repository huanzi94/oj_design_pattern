package responsibilitychainpattern;

/**
 * 部门经理处理类
 */
public class HoDHandler extends Handler {
    private Handler nextHandle;

    public void setNextHandle(Handler nextHandle) {
        this.nextHandle = nextHandle;
    }

    @Override
    public String process(int days) {
        if (days > 3) {
            System.out.println("请假时间为：" + days + "部门经理需要提交地域经理审核");
            return nextHandle.process(days);
        } else {
            return "请假时间为：" + days + "部门经理审核通过！";
        }
    }
}
