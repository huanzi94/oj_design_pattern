package responsibilitychainpattern;

/**
 * CEO处理类
 */
public class CEOHandler extends Handler {

    @Override
    public String process(int days) {
        return "请假时间为：" + days + "CEO审核通过！";
    }
}
