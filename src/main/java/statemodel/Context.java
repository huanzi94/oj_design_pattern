package statemodel;

/**
 * 状态管理者
 */
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    /**
     * 获取当前状态下的具体信息
     */
    public void process() {
       this.state.rule();
    }
}
