package responsibilitychainpattern;

/**
 * 辅助类，处理责任链。
 */
public class Context {

    public Handler getHandles() {
        ProjectManagerHandler projectManagerHandler = new ProjectManagerHandler();
        HoDHandler hoDHandler = new HoDHandler();
        TerritoryManagerHandler territoryManagerHandler = new TerritoryManagerHandler();
        CEOHandler ceoHandler = new CEOHandler();

        projectManagerHandler.setNextHandle(hoDHandler);
        hoDHandler.setNextHandle(territoryManagerHandler);
        territoryManagerHandler.setNextHandle(ceoHandler);
        return projectManagerHandler;
    }
}
