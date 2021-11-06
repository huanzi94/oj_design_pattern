package statemodel;

/**
 * 状态接口
 */
public interface State {

    /**
     * 行为
     * @param context 状态管理者
     */
    void action(Context context);

    /**
     * 这个状态下的规则
     */
    void rule();
}
