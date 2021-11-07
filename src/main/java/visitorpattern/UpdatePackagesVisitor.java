package visitorpattern;

/**
 * 软件升级包，访问者角色，会访问到CPU，更新结果
 */
public class UpdatePackagesVisitor implements Visitor{

    public UpdatePackagesVisitor() {
    }

    @Override
    public void CPUVisitor(Cpu cpu) {
        cpu.result += 1;
    }
}
