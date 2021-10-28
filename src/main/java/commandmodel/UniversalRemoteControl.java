package commandmodel;

/**
 * 万能遥控器
 */
public class UniversalRemoteControl {

    /**
     * 存放开的所有命令
     */
    private Command[] onCommand;

    /**
     * 存放关的所有命令
     */
    private Command[] offCommand;

    /**
     * 存放撤销命令
     */
    private Command unDoCommand;

    /**
     * 初始化命令：offCommand、onCommand、unDoCommand中所有的命令应该都为空命令
     */
    public UniversalRemoteControl() {
        this.onCommand = new Command[]{new NoCommand(), new NoCommand(), new NoCommand()};
        this.offCommand = new Command[]{new NoCommand(), new NoCommand(), new NoCommand()};
        this.unDoCommand = new NoCommand();
    }

    /**
     * 设置按钮组命令，例如：
     * 1、电灯,LightOnCommand,LightOffCommand
     * 2、电视,TVOnCommand,TVOffCommand
     * 3、空调,LightOnCommand,LightOffCommand
     * @param no 代表对应的那个电器
     * @param onCommand 电器对应的开命令
     * @param offCommand 电器对应的关命令
     */
    public void setCommands(int no, Command onCommand, Command offCommand) {
        this.onCommand[no] = onCommand;
        this.offCommand[no] = offCommand;
    }

    /**
     * 开命令按钮按下后，执行开命令封装对象的execute方法，并记录当前的命令，用于撤销。
     * @param no 对应的电器
     */
    public void onButtonPushed(int no) {
        this.onCommand[no].execute();
        this.unDoCommand = this.onCommand[no];
    }

    /**
     * 关命令按钮按下后，执行关命令封装对象的execute方法，并记录当前的命令，用于撤销。
     * @param no 对应的电器
     */
    public void offButtonPushed(int no) {
        this.offCommand[no].execute();
        this.unDoCommand = this.offCommand[no];
    }

    /**
     * 按下撤销按钮，执行unDoCommand命令记录的上一次的封装对象的undo方法
     */
    public void onDoButtonPushed() {
        this.unDoCommand.undo();
    }
}
