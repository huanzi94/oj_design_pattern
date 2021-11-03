package mementomodel;

/**
 * GameOriginator游戏角色的备忘录对象。
 */
public class GameMemento {

    private String status;

    private String stage;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public GameMemento(GameOriginator gameOriginator) {
        this.status = gameOriginator.getStatus();
        this.stage = gameOriginator.getStage();
    }

    /**
     * 备忘录对象中记录原始对象的状态
     * @param gameOriginator 原始对象
     */
    public void saveStatus(GameOriginator gameOriginator) {
        this.status = gameOriginator.getStatus();
        this.stage = gameOriginator.getStage();
    }
}
