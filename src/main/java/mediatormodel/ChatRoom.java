package mediatormodel;

import java.util.Date;

/**
 * 聊天室，中介者，所有用户发送过来的消息，都由它处理
 */
public class ChatRoom {

    /**
     * 处理消息
     *
     * @param user 具体的用户
     */
    public static void showMessage(User user) {
        System.out.println(new Date() + "--" + user.getName() + "--" + user.getMessage());
    }
}
