package visitorpattern;

/**
 * 机器人
 */
public class Robot {

    private final Cpu cpu;

    public Robot(Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * 执行计算
     */
    public void calc() {
        cpu.run();
    }

    /**
     * 提供一个统一接受访问者的入口
     */
    public void accept(Visitor visitor) {
        visitor.CPUVisitor(cpu);
    }
}
