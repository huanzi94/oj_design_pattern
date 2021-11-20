package mementopattern;

/**
 * GameOriginator游戏角色的备忘录对象。
 */
public class GameMemento {

    private final String status;

    private final String stage;

    public GameMemento(GameOriginator gameOriginator) {
        this.status = gameOriginator.getStatus();
        this.stage = gameOriginator.getStage();
    }

    public String getStatus() {
        return status;
    }

    public String getStage() {
        return stage;
    }
}
