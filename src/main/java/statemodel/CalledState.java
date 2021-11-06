package statemodel;

/**
 * 已经叫号状态
 */
public class CalledState implements State {

    @Override
    public void action(Context context) {
        context.setState(this);
    }

    @Override
    public void rule() {
        System.out.println("当前属于已叫号状态，您可以进入窗口办理业务了！");
    }
}
