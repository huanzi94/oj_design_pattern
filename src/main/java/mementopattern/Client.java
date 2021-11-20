package mementopattern;

public class Client {

    public static void main(String[] args) {
        GameCareTaker gameCareTaker = new GameCareTaker();

        GameOriginator gameOriginator = new GameOriginator("满血100", "#1", "超人");
        GameMemento gameMemento = new GameMemento(gameOriginator);
        gameCareTaker.addGameMemento(gameMemento);
        System.out.println(gameOriginator.getName() + " -- " + gameOriginator.getStage() + " -- " + gameOriginator.getStatus());

        gameOriginator.setStage("#2");
        gameOriginator.setStatus("半血50");
        GameMemento gameMemento2 = new GameMemento(gameOriginator);
        gameCareTaker.addGameMemento(gameMemento2);
        System.out.println(gameOriginator.getName() + " -- " + gameOriginator.getStage() + " -- " + gameOriginator.getStatus());

        gameOriginator.setStage("#3");
        gameOriginator.setStatus("残血20");
        GameMemento gameMemento3 = new GameMemento(gameOriginator);
        gameCareTaker.addGameMemento(gameMemento3);
        System.out.println(gameOriginator.getName() + " -- " + gameOriginator.getStage() + " -- " + gameOriginator.getStatus());

        GameMemento memento = gameCareTaker.getGameMemento("#2");
        gameOriginator.setStatus(memento.getStatus());
        gameOriginator.setStage(memento.getStage());
        System.out.println("即将恢复到#2状态********");
        System.out.println(gameOriginator.getName() + " -- " + gameOriginator.getStage() + " -- " + gameOriginator.getStatus());
    }
}
