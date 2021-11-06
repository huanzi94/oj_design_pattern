package mediatormodel;

public class Client {

    public static void main(String[] args) {
        User tom = new User("Tom", "你好，Jerry");
        User jerry = new User("Jerry", "你好，Tom");
        tom.sendMessage();
        jerry.sendMessage();
    }
}
