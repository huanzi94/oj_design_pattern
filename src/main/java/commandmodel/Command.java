package commandmode;

/**
 * 命令接口
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
