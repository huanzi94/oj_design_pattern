package mediatormodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 聊天室，中介者，所有用户发送过来的消息，都由它处理
 */
public class ChatRoom {

    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    /**
     * 处理消息
     *
     * @param user 具体的用户
     */
    public static void showMessage(User user) {
        System.out.println(new Date() + "--" + user.getName() + "--" + user.getMessage());
    }
}
