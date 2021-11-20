package commandpattern;

public class Client {

    public static void main(String[] args) {
        LightOnCommand lightOnCommand = new LightOnCommand(new LightReceiver());
        LightOffCommand lightOffCommand = new LightOffCommand(new LightReceiver());
        UniversalRemoteControl universalRemoteControl = new UniversalRemoteControl();
        universalRemoteControl.setCommands(1, lightOnCommand, lightOffCommand);
        universalRemoteControl.onButtonPushed(1);
        universalRemoteControl.offButtonPushed(1);
        universalRemoteControl.onDoButtonPushed();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        TVOffCommand tvOffCommand = new TVOffCommand(new TVReceiver());
        TVOnCommand tvOnCommand = new TVOnCommand(new TVReceiver());
        universalRemoteControl.setCommands(2, tvOnCommand, tvOffCommand);
        universalRemoteControl.onButtonPushed(2);
        universalRemoteControl.offButtonPushed(2);
        universalRemoteControl.onDoButtonPushed();
    }
}
