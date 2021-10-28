package commandmodel;

/**
 * 电灯命令接受者
 */
public class LightReceiver {

    /**
     * 开灯
     */
    public void on() {
        System.out.println("电灯开灯了");
    }

    /**
     * 关灯
     */
    public void off() {
        System.out.println("电灯关灯了");
    }
}
