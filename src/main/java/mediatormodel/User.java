package mediatormodel;

/**
 * 用户
 */
public class User {

    private String name;

    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User(String name, String message) {
        this.name = name;
        this.message = message;
    }

    /**
     * 发送消息
     */
    public void sendMessage() {
        ChatRoom.showMessage(this);
    }
}
