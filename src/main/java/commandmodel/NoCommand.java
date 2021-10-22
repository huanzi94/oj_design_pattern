package commandmode;

/**
 * 空命令
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("空命令，不执行任何操作");
    }

    @Override
    public void undo() {
        System.out.println("空命令，不执行任何操作");
    }
}
