package mementomodel;

/**
 * 原始对象
 */
public class GameOriginator {
    private String status;

    private String stage;

    private String name;

    public GameOriginator(String status, String stage, String name) {
        this.status = status;
        this.stage = stage;
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
