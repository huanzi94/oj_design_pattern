package statepattern;

/**
 * 已经结束叫号了
 */
public class EndCalledState implements State {

    @Override
    public void action(Context context) {
        context.setState(this);
    }

    @Override
    public void rule() {
        System.out.println("当前已经办理结束，您可以离开了！");
    }
}
