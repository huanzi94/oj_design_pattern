package responsibilitychainmodel;

public class TerritoryManagerHandler extends Handler{
    private Handler nextHandle;

    public void setNextHandle(Handler nextHandle) {
        this.nextHandle = nextHandle;
    }

    @Override
    public String process(int days) {
        if (days > 8) {
            System.out.println("请假时间为：" + days + "地域经理需要提交CEO审核" );
            return nextHandle.process(days);
        } else {
            return "请假时间为：" + days + "地域经理审核通过！";
        }
    }
}
