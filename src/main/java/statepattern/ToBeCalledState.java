package statepattern;

/**
 * 等待叫号状态
 */
public class ToBeCalledState implements State {

    @Override
    public void action(Context context) {
        context.setState(this);
    }

    @Override
    public void rule() {
        System.out.println("当前属于待叫号状态，您只能等待！");
    }
}
