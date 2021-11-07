package responsibilitychainmodel;

/**
 * CEO处理类
 */
public class CEOHandler extends Handler {
    private Handler nextHandle;

    public void setNextHandle(Handler nextHandle) {
        this.nextHandle = nextHandle;
    }

    @Override
    public String process(int days) {
        return "请假时间为：" + days + "CEO审核通过！";
    }
}
