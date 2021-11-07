package mementomodel;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录对象管理者
 */
public class GameCareTaker {

    List<GameMemento> gameMementos = new ArrayList<>();

    /**
     * 添加一个备忘录对象
     *
     * @param gameMemento 备忘录对象
     */
    public void addGameMemento(GameMemento gameMemento) {
        gameMementos.add(gameMemento);
    }

    /**
     * 获取指定阶段的角色状态，实际上是获取该阶段的备忘录对象
     * 之后从备忘录对象中恢复对象状态。
     *
     * @param stage 阶段
     * @return 备忘录对象
     */
    public GameMemento getGameMemento(String stage) {
        for (GameMemento gameMemento : gameMementos) {
            if (stage.equals(gameMemento.getStage())) {
                return gameMemento;
            }
        }

        return null;
    }
}
