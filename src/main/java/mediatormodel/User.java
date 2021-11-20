package mediatormodel;

/**
 * 用户
 */
public class User {

    private String name;

    private String message;

    public User(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    /**
     * 发送消息
     */
    public void sendMessage() {
        ChatRoom.showMessage(this);
    }
}
